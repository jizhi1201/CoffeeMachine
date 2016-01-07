UnmarkedObjectFolder := D:/Local_Repositories/CoffeeMachine/YTQ/CoffeeMachine/Logical/Program
MarkedObjectFolder := D:/Local_Repositories/CoffeeMachine/YTQ/CoffeeMachine/Logical/Program

$(AS_CPU_PATH)/program1.br: \
	$(AS_PROJECT_CPU_PATH)/Cpu.per \
	$(AS_CPU_PATH)/program1/program1.ox
	@"$(AS_BIN_PATH)/BR.AS.TaskBuilder.exe" "$(AS_CPU_PATH)/program1/program1.ox" -o "$(AS_CPU_PATH)/program1.br" -v V1.00.0 -f "$(AS_CPU_PATH)/NT.ofs" -offsetLT "$(AS_BINARIES_PATH)/$(AS_CONFIGURATION)/$(AS_PLC)/LT.ofs" -T SG4  -M IA32  -B H4.23 -extConstants -r Cyclic4 -p 2 -s "Program" -L "AsIecCon: V*, astime: V*, Operator: V*, Runtime: V*" -P "$(AS_PROJECT_PATH)" -secret "$(AS_PROJECT_PATH)_br.as.taskbuilder.exe"

$(AS_CPU_PATH)/program1/program1.ox: \
	$(AS_CPU_PATH)/program1/a.out
	@"$(AS_BIN_PATH)/BR.AS.Backend.exe" "$(AS_CPU_PATH)/program1/a.out" -o "$(AS_CPU_PATH)/program1/program1.ox" -T SG4 -r Cyclic4   -G V4.1.2  -secret "$(AS_PROJECT_PATH)_br.as.backend.exe"

$(AS_CPU_PATH)/program1/a.out: \
	$(AS_CPU_PATH)/program1/Cyclic.cpp.o \
	$(AS_CPU_PATH)/program1/Init.cpp.o \
	$(AS_CPU_PATH)/program1/Exit.cpp.o \
	$(AS_CPU_PATH)/program1/class_def.cpp.o \
	$(AS_CPU_PATH)/program1/auxiliary.cpp.o
	@"$(AS_BIN_PATH)/BR.AS.CCompiler.exe" -link "$(AS_CPU_PATH)/program1/Cyclic.cpp.o" "$(AS_CPU_PATH)/program1/Init.cpp.o" "$(AS_CPU_PATH)/program1/Exit.cpp.o" "$(AS_CPU_PATH)/program1/class_def.cpp.o" "$(AS_CPU_PATH)/program1/auxiliary.cpp.o"  -o "$(AS_CPU_PATH)/program1/a.out"  -G V4.1.2  -T SG4  -M IA32  "-Wl,$(AS_SYSTEM_PATH)/H0423/SG4/IA32/libAsIecCon.a" "-Wl,$(AS_SYSTEM_PATH)/H0423/SG4/IA32/libastime.a" "-Wl,$(AS_SYSTEM_PATH)/H0423/SG4/IA32/libOperator.a" "-Wl,$(AS_SYSTEM_PATH)/H0423/SG4/IA32/libRuntime.a" -specs=I386specs -Wl,-q,-T,bur_elf_i386.x -Wl,-lstdc++,-lsupc++,-lbur_cpp,-lbur_cpp_rtk -secret "$(AS_PROJECT_PATH)_br.as.ccompiler.exe"

$(AS_CPU_PATH)/program1/Cyclic.cpp.o: \
	$(AS_PROJECT_PATH)/Logical/Program/Cyclic.cpp \
	FORCE 
	@"$(AS_BIN_PATH)/BR.AS.CCompiler.exe" "$(AS_PROJECT_PATH)/Logical/Program/Cyclic.cpp" -o "$(AS_CPU_PATH)/program1/Cyclic.cpp.o"  -T SG4  -M IA32  -B H4.23 -G V4.1.2  -s "Program" -t "$(AS_TEMP_PATH)" -I "$(AS_PROJECT_PATH)/Logical/Program" "$(AS_TEMP_PATH)/Includes/Program" "$(AS_TEMP_PATH)/Includes" "$(AS_PROJECT_PATH)/Logical/Program/eigen-eigen-b30b87236a1b" -trigraphs -fno-asm -D _DEFAULT_INCLUDES -D _SG4 -fPIC -O0 -g -Wall -include "$(AS_CPU_PATH)/Libraries.h" -x c++ -P "$(AS_PROJECT_PATH)" -secret "$(AS_PROJECT_PATH)_br.as.ccompiler.exe"

$(AS_CPU_PATH)/program1/Init.cpp.o: \
	$(AS_PROJECT_PATH)/Logical/Program/Init.cpp \
	FORCE 
	@"$(AS_BIN_PATH)/BR.AS.CCompiler.exe" "$(AS_PROJECT_PATH)/Logical/Program/Init.cpp" -o "$(AS_CPU_PATH)/program1/Init.cpp.o"  -T SG4  -M IA32  -B H4.23 -G V4.1.2  -s "Program" -t "$(AS_TEMP_PATH)" -I "$(AS_PROJECT_PATH)/Logical/Program" "$(AS_TEMP_PATH)/Includes/Program" "$(AS_TEMP_PATH)/Includes" "$(AS_PROJECT_PATH)/Logical/Program/eigen-eigen-b30b87236a1b" -trigraphs -fno-asm -D _DEFAULT_INCLUDES -D _SG4 -fPIC -O0 -g -Wall -include "$(AS_CPU_PATH)/Libraries.h" -x c++ -P "$(AS_PROJECT_PATH)" -secret "$(AS_PROJECT_PATH)_br.as.ccompiler.exe"

$(AS_CPU_PATH)/program1/Exit.cpp.o: \
	$(AS_PROJECT_PATH)/Logical/Program/Exit.cpp \
	FORCE 
	@"$(AS_BIN_PATH)/BR.AS.CCompiler.exe" "$(AS_PROJECT_PATH)/Logical/Program/Exit.cpp" -o "$(AS_CPU_PATH)/program1/Exit.cpp.o"  -T SG4  -M IA32  -B H4.23 -G V4.1.2  -s "Program" -t "$(AS_TEMP_PATH)" -I "$(AS_PROJECT_PATH)/Logical/Program" "$(AS_TEMP_PATH)/Includes/Program" "$(AS_TEMP_PATH)/Includes" "$(AS_PROJECT_PATH)/Logical/Program/eigen-eigen-b30b87236a1b" -trigraphs -fno-asm -D _DEFAULT_INCLUDES -D _SG4 -fPIC -O0 -g -Wall -include "$(AS_CPU_PATH)/Libraries.h" -x c++ -P "$(AS_PROJECT_PATH)" -secret "$(AS_PROJECT_PATH)_br.as.ccompiler.exe"

$(AS_CPU_PATH)/program1/class_def.cpp.o: \
	$(AS_PROJECT_PATH)/Logical/Program/class_def.cpp \
	FORCE 
	@"$(AS_BIN_PATH)/BR.AS.CCompiler.exe" "$(AS_PROJECT_PATH)/Logical/Program/class_def.cpp" -o "$(AS_CPU_PATH)/program1/class_def.cpp.o"  -T SG4  -M IA32  -B H4.23 -G V4.1.2  -s "Program" -t "$(AS_TEMP_PATH)" -I "$(AS_PROJECT_PATH)/Logical/Program" "$(AS_TEMP_PATH)/Includes/Program" "$(AS_TEMP_PATH)/Includes" "$(AS_PROJECT_PATH)/Logical/Program/eigen-eigen-b30b87236a1b" -trigraphs -fno-asm -D _DEFAULT_INCLUDES -D _SG4 -fPIC -O0 -g -Wall -include "$(AS_CPU_PATH)/Libraries.h" -x c++ -P "$(AS_PROJECT_PATH)" -secret "$(AS_PROJECT_PATH)_br.as.ccompiler.exe"

$(AS_CPU_PATH)/program1/auxiliary.cpp.o: \
	$(AS_PROJECT_PATH)/Logical/Program/auxiliary.cpp \
	FORCE 
	@"$(AS_BIN_PATH)/BR.AS.CCompiler.exe" "$(AS_PROJECT_PATH)/Logical/Program/auxiliary.cpp" -o "$(AS_CPU_PATH)/program1/auxiliary.cpp.o"  -T SG4  -M IA32  -B H4.23 -G V4.1.2  -s "Program" -t "$(AS_TEMP_PATH)" -I "$(AS_PROJECT_PATH)/Logical/Program" "$(AS_TEMP_PATH)/Includes/Program" "$(AS_TEMP_PATH)/Includes" "$(AS_PROJECT_PATH)/Logical/Program/eigen-eigen-b30b87236a1b" -trigraphs -fno-asm -D _DEFAULT_INCLUDES -D _SG4 -fPIC -O0 -g -Wall -include "$(AS_CPU_PATH)/Libraries.h" -x c++ -P "$(AS_PROJECT_PATH)" -secret "$(AS_PROJECT_PATH)_br.as.ccompiler.exe"

-include $(AS_CPU_PATH)/Force.mak 



FORCE: