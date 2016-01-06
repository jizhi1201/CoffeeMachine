#include "auxiliary.h"

InputCom input;

InputCom Input()
	{
		char str[11];
		InputCom input;
		cout<<"Input OperationType 'S'or'M':"<<endl;
		cin>>str;
		strcpy(input.OperationType,str);
		cout<<"Input CSName:"<<endl;
		cin>>str;
		strcpy(input.CSName,str);
		cout<<"Input para1:"<<endl;
		cin>>str;
		input.para1=Extraction(str);
		cout<<"Input para2:"<<endl;
		cin>>str;
		input.para2=Extraction(str);
		if(strcmp(input.OperationType,"S")==0)
			{
				cout<<"Input para3:"<<endl;
				cin>>str;
				input.para3=Extraction(str);
				return input;
			}
		else
			{
				input.para3=0;
				return input;
			}
	}

float Extraction(char str[11])
	{
		int i,k;
		float a=0;
		for(i=0;str[i]!='\0';i++)
			{
				if(str[i]=='.')
					{
						k=i;
					}
			}
		if(str[0]=='-')
			{
				for(i=0;i<k-1;i++)
					{
						a+=((float)str[k-i-1]-48)*Index1(i);
					}
				for(i=1;str[k+i]!='\0';i++)
					{
						a+=((float)str[k+i]-48)*Index2(i);
					}
			}
		else
			{
				for(i=0;i<k;i++)
					{
						a+=((float)str[k-i-1]-48)*Index1(i);
					}
				for(i=1;str[k+i]!='\0';i++)
					{
						a+=((float)str[k+i]-48)*Index2(i);
					}
			}
		return a;
	}

float Index1(int n)
	{
		float a=1,i;
		for(i=n;i!=0;i--)
			{
				a*=10;
			}
		return a;
	}

float Index2(int n)
	{
		float a=1,i;
		for(i=n;i!=0;i--)
			{
				a*=0.1;
			}
		return a;
	}

