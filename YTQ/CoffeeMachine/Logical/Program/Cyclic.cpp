#include <bur/plctypes.h>
#ifdef _DEFAULT_INCLUDES
	#include <AsDefault.h>
#endif

#include "class_dec.h"
#include "auxiliary.h"

myRobot robot;

void _CYCLIC ProgramCyclic(void)
{
	robot.Operation();
}
