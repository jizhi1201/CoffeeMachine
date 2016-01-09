$(AS_CPU_PATH)/sysconf.br: \
	FORCE \
	$(AS_PROJECT_CONFIG_PATH)/Hardware.hw 
	@"$(AS_BIN_PATH)/BR.AS.ConfigurationBuilder.exe" "$(AS_PROJECT_CONFIG_PATH)/Hardware.hw"  -c Simulation -sysconf -S "PC_any" -o "$(AS_CPU_PATH)/sysconf.br" -T SG4  -B H4.23 -P "$(AS_PROJECT_PATH)" -s "Simulation" -secret "$(AS_PROJECT_PATH)_br.as.configurationbuilder.exe"

FORCE:

-include $(AS_CPU_PATH)/Force.mak 
