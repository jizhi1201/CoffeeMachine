#ifndef __CLASS_DEC_H
#define __CLASS_DEC_H

#include <iostream>
#include <vector>
#include <Eigen/Dense>
#include <math.h>

using namespace std;
using Eigen::MatrixXd;

class CS
	{
		public:
			CS();
			void Set(char n[11],float a,float b,float c);
			char* GetName();
			void Insert(float a,float b);
			void Transform();
		protected:
			char name[11];
			float x;
			float y;
			float angle;
			//MatrixXd mov;
			float para1;
			float para2;
	};
	
class myRobot
	{
		public:
			myRobot();
			void Set(float a,float b);
			void Operation();
			void PTPMove();	
			void Show();		
		protected:
			float angle1;
			float angle2;
			vector<CS> cs_vector;
			vector<CS>::iterator it;
	};
	
extern myRobot robot;
	
#endif	
		
