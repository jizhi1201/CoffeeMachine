/*************************************************************************************************/
/*@note
	這個文件里定義了所有的類的成員函數 
*/

/**includes***************************************************************************************/ 
#include "auxiliary.h"
#include "class_dec.h"

/**CS::Fuctions***********************************************************************************/

/*@note
	CS的構造函數 
*/
CS::CS()
	{
		strcpy(name,"TCS");
		x=0;
		y=0;
		angle=0;
	}

/*@note
	用來設定新建坐標系相對於世界坐標系的平移、旋轉量
*/	
void CS::Set(char n[11],float a,float b,float c)
	{
		strcpy(name,n);
		x=a;
		y=b;
		angle=c;
	}

/*@note
	獲取坐標系名稱
*/	
char* CS::GetName()
	{
		return name;
	}

/*@note
	插入該坐標系下用戶要求機器人到達的坐標
*/	
void CS::Insert(float a,float b)
	{
		para1=a;
		para2=b;
	}	

/*@note
	將該坐標系下的坐標變換至世界坐標系并更新關節坐標系中的坐標值
*/ 
void CS::Transform()
	{
		MatrixXd mov(3,3);
		//cout<<angle<<endl;
		mov(0,0)=cos(angle*0.0174533);
		//cout<<mov(0,0)<<endl;
		mov(0,1)=sin(angle*0.0174533);
		mov(0,2)=x;
		mov(1,0)=-sin(angle*0.0174533);
		mov(1,1)=cos(angle*0.0174533);
		mov(1,2)=y;
		mov(2,0)=0;
		mov(2,1)=0;
		mov(2,2)=1;
		MatrixXd coor_TCS(3,1);
		coor_TCS(0,0)=para1;
		coor_TCS(1,0)=para2;
		coor_TCS(2,0)=1;
		MatrixXd coor_WCS(3,1);
		coor_WCS=mov*coor_TCS;
		if((coor_WCS(0,0)*coor_WCS(0,0)+coor_WCS(1,0)*coor_WCS(1,0))>=400)    //這裡假定機器人兩個手臂的長度都是10，所以半徑20的圓以外的地方是到不了的 
			{
				cout<<"Robot can't reach that point!"<<endl;
			}
		else
			{
				cout<<"The coordinates of the Robot in WCS are shown as below:"<<endl<<"("<<coor_WCS(0,0)<<","<<coor_WCS(1,0)<<")"<<endl;
				robot.Set(acos(sqrt(coor_WCS(0,0)*coor_WCS(0,0)+coor_WCS(1,0)*coor_WCS(1,0))/20)+atan(coor_WCS(1,0)/coor_WCS(0,0)),\
				2*(90-acos(sqrt(coor_WCS(0,0)*coor_WCS(0,0)+coor_WCS(1,0)*coor_WCS(1,0))/20)));
			}
	}

/**myRobot::Functions*****************************************************************************/

/*@note
	構造函數
*/ 
myRobot::myRobot()
	{
		angle1=90;
		angle2=180;
		CS* p;
		p=new CS;
		char str[3]={'W','C','S'};
		p->Set(str,0,0,0);
		cs_vector.push_back(*p);
	}
	
/*@note
	更新關節坐標系下的坐標值
*/	
void myRobot::Set(float a,float b)
	{
		angle1=a;
		angle2=b;
	}

/*@note
	判斷用戶是新建坐標系還是移動機器人
*/	
void myRobot::Operation()
	{
		input=Input();
		if(strcmp(input.OperationType,"S")==0)
			{
				CS* p;
				p=new CS;
				p->Set(input.CSName,input.para1,input.para2,input.para3);
				//cout<<input.CSName<<endl<<input.para1<<endl<<input.para2<<endl<<input.para3<<endl;
				cs_vector.push_back(*p);
			}
		else
			{
				PTPMove();
			}		
	}

/*@note
	實現坐標變換并更新關節坐標系下坐標
*/ 
void myRobot::PTPMove()
	{
		for(it=cs_vector.begin();it!=cs_vector.end();it++)
			{
				if(strcmp(it->GetName(),input.CSName)==0)
					{
						it->Insert(input.para1,input.para2);
						it->Transform();
						Show();
						break;
					}
			}
	}

/*@note
	顯示關節坐標系下坐標
*/	
void myRobot::Show()
	{
		cout<<"The coordinates of the Robot in Joint_CS are shown as below:"<<endl<<"("<<angle1<<","<<angle2<<")"<<endl;
	}
	
