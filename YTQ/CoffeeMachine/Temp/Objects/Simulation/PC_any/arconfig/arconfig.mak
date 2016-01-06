$(AS_CPU_PATH)/arconfig.br: \
	$(AS_PROJECT_CONFIG_PATH)/Hardware.hw \
	$(AS_PROJECT_CPU_PATH)/IoMap.iom \
	$(AS_PROJECT_PATH)/Physical/$(AS_CONFIGURATION)/Hardware.hw
	@"$(AS_BIN_PATH)/BR.AS.ConfigurationBuilder.exe" "$(AS_PROJECT_CONFIG_PATH)/Hardware.hw" "$(AS_PROJECT_CPU_PATH)/IoMap.iom"  -arconfig -c Simulation -v V1.00.0 -S "PC_any" -o "$(AS_CPU_PATH)/arconfig.br" "$(AS_CPU_PATH)/ChannelConfiguration.xml" "$(AS_CPU_PATH)/HardwareConfiguration.xml" "$(AS_CPU_PATH)/ReActionTechnologyConfiguration.xml" -T SG4  -B H4.23 -P "$(AS_PROJECT_PATH)" -s "Simulation" -secret "$(AS_PROJECT_PATH)_br.as.configurationbuilder.exe"

-include $(AS_CPU_PATH)/Force.mak 
