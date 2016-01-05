SHELL = cmd.exe
CYGWIN=nontsec
export PATH := C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Program Files (x86)\ATI Technologies\ATI.ACE\Core-Static;E:\matlab2015a\runtime\win64;E:\matlab2015a\bin;E:\matlab2015a\polyspace\bin;E:\LabView\WinNT\Bin\;C:\Program Files\IVI Foundation\VISA\Win64\Bin\;E:\LabView\WinNT\Bin;C:\Program Files (x86)\Common Files\Hilscher GmbH\TLRDecode;C:\Program Files (x86)\Common Files\Hilscher GmbH\TLRDecode
export AS_BUILD_MODE := Build
export AS_VERSION := 4.2.3.159
export AS_COMPANY_NAME := 微软中国
export AS_USER_NAME := Administrator
export AS_PATH := E:/AS/AS42
export AS_BIN_PATH := E:/AS/AS42/Bin-en
export AS_PROJECT_PATH := D:/Local_Repositories/CoffeeMachine/YTQ/CoffeeMachine
export AS_PROJECT_NAME := CoffeeMachine
export AS_SYSTEM_PATH := E:/AS/AS/System
export AS_VC_PATH := E:/AS/AS42/AS/VC
export AS_TEMP_PATH := D:/Local_Repositories/CoffeeMachine/YTQ/CoffeeMachine/Temp
export AS_CONFIGURATION := Simulation
export AS_BINARIES_PATH := D:/Local_Repositories/CoffeeMachine/YTQ/CoffeeMachine/Binaries
export AS_GNU_INST_PATH := E:/AS/AS42/AS/GnuInst/V4.1.2
export AS_GNU_BIN_PATH := $(AS_GNU_INST_PATH)/bin
export AS_GNU_INST_PATH_SUB_MAKE := E:/AS/AS42/AS/GnuInst/V4.1.2
export AS_GNU_BIN_PATH_SUB_MAKE := $(AS_GNU_INST_PATH_SUB_MAKE)/bin
export AS_INSTALL_PATH := E:/AS/AS42
export WIN32_AS_PATH := "E:\AS\AS42"
export WIN32_AS_BIN_PATH := "E:\AS\AS42\Bin-en"
export WIN32_AS_PROJECT_PATH := "D:\Local_Repositories\CoffeeMachine\YTQ\CoffeeMachine"
export WIN32_AS_SYSTEM_PATH := "E:\AS\AS\System"
export WIN32_AS_VC_PATH := "E:\AS\AS42\AS\VC"
export WIN32_AS_TEMP_PATH := "D:\Local_Repositories\CoffeeMachine\YTQ\CoffeeMachine\Temp"
export WIN32_AS_BINARIES_PATH := "D:\Local_Repositories\CoffeeMachine\YTQ\CoffeeMachine\Binaries"
export WIN32_AS_GNU_INST_PATH := "E:\AS\AS42\AS\GnuInst\V4.1.2"
export WIN32_AS_GNU_BIN_PATH := "$(WIN32_AS_GNU_INST_PATH)\\bin" 
export WIN32_AS_INSTALL_PATH := "E:\AS\AS42"

.suffixes:

ProjectMakeFile:

	@"$(AS_BIN_PATH)/BR.AS.AnalyseProject.exe" "$(AS_PROJECT_PATH)/CoffeeMachine.apj" -t "$(AS_TEMP_PATH)" -c "$(AS_CONFIGURATION)" -o "$(AS_BINARIES_PATH)"   -sfas -buildMode "Build" 

	@$(AS_GNU_BIN_PATH)/mingw32-make.exe -r -f 'D:/Local_Repositories/CoffeeMachine/YTQ/CoffeeMachine/Temp/Objects/$(AS_CONFIGURATION)/PC_any/#cpu.mak' -k 

