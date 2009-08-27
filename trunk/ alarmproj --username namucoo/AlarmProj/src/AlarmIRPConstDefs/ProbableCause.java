package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/ProbableCause.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/


/*
   This block identifies the probable cause of a reported alarm.
   */
public interface ProbableCause extends ProbableCauseOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{

  /*
        Probable causes originating from M.3100.
        Values below correspond to M.3100 values.
        */
  public static final short INDETERMINATE = (short)(0);
  public static final short ALARM_INDICATION_SIGNAL = (short)(1);
  public static final short CALL_SETUP_FAILURE = (short)(2);
  public static final short DEGRADED_SIGNAL = (short)(3);
  public static final short FAR_END_RECEIVER_FAILURE = (short)(4);
  public static final short FRAMING_ERROR = (short)(5);
  public static final short LOSS_OF_FRAME = (short)(6);
  public static final short LOSS_OF_POINTER = (short)(7);
  public static final short LOSS_OF_SIGNAL = (short)(8);
  public static final short PAYLOAD_TYPE_MISMATCH = (short)(9);

  // Values 10 correspond to a duplicated probable cause
  public static final short REMOTE_ALARM_INTERFACE = (short)(11);
  public static final short EXCESSIVE_BIT_ERROR_RATE = (short)(12);
  public static final short PATH_TRACE_MISMATCH = (short)(13);
  public static final short UNAVAILABLE = (short)(14);
  public static final short SIGNAL_LABEL_MISMATCH = (short)(15);
  public static final short LOSS_OF_MULTI_FRAME = (short)(16);
  public static final short COMMUNICATIONS_RECEIVE_FAILURE = (short)(17);
  public static final short COMMUNICATIONS_TRANSMIT_FAILURE = (short)(18);
  public static final short MODULATION_FAILURE = (short)(19);
  public static final short DEMODULATION_FAILURE = (short)(20);

  // Values 27-50 are reserved for M.3100 potential future extensions
  public static final short BACK_PLANE_FAILURE = (short)(51);
  public static final short DATA_SET_PROBLEM = (short)(52);
  public static final short EQUIPMENT_IDENTIFIER_DUPLICATION = (short)(53);
  public static final short EXTERNAL_IF_DEVICE_PROBLEM = (short)(54);
  public static final short LINE_CARD_PROBLEM = (short)(55);
  public static final short MULTIPLEXER_PROBLEM = (short)(56);
  public static final short NE_IDENTIFIER_DUPLICATION = (short)(57);
  public static final short POWER_PROBLEM = (short)(58);
  public static final short PROCESSOR_PROBLEM = (short)(59);
  public static final short PROTECTION_PATH_FAILURE = (short)(60);
  public static final short RECEIVER_FAILURE = (short)(61);
  public static final short REPLACEABLE_UNIT_MISSING = (short)(62);
  public static final short REPLACEABLE_UNIT_TYPE_MISMATCH = (short)(63);
  public static final short SYNCHRONIZATION_SOURCE_MISMATCH = (short)(64);
  public static final short TERMINAL_PROBLEM = (short)(65);
  public static final short TIMING_PROBLEM = (short)(66);
  public static final short TRANSMITTER_FAILURE = (short)(67);
  public static final short TRUNK_CARD_PROBLEM = (short)(68);
  public static final short REPLACEABLE_UNIT_PROBLEM = (short)(69);
  public static final short REAL_TIME_CLOCK_FAILURE = (short)(70);

  // Values 71-80 correspond to duplicated probable causes
  public static final short PROTECTION_MECHANISM_FAILURE = (short)(81);
  public static final short PROTECTING_RESOURCE_FAILURE = (short)(82);

  // Values 83-100 are reserved for M.3100 potential future extensions
  public static final short AIR_COMPRESSOR_FAILURE = (short)(101);
  public static final short AIR_CONDITIONING_FAILURE = (short)(102);
  public static final short AIR_DRYER_FAILURE = (short)(103);
  public static final short BATTERY_DISCHARGING = (short)(104);
  public static final short BATTERY_FAILURE = (short)(105);
  public static final short COMMERCIAL_POWER_FAILURE = (short)(106);
  public static final short COOLING_FAN_FAILURE = (short)(107);
  public static final short ENGINE_FAILURE = (short)(108);
  public static final short FIRE_DETECTOR_FAILURE = (short)(109);
  public static final short FUSE_FAILURE = (short)(110);
  public static final short GENERATOR_FAILURE = (short)(111);
  public static final short LOW_BATTERY_THRESHOLD = (short)(112);
  public static final short PUMP_FAILURE = (short)(113);
  public static final short RECTIFIER_FAILURE = (short)(114);
  public static final short RECTIFIER_HIGH_VOLTAGE = (short)(115);
  public static final short RECTIFIER_LOW_F_VOLTAGE = (short)(116);
  public static final short VENTILATION_SYSTEM_FAILURE = (short)(117);
  public static final short ENCLOSURE_DOOR_OPEN = (short)(118);
  public static final short EXPLOSIVE_GAS = (short)(119);
  public static final short FIRE = (short)(120);
  public static final short FLOOD = (short)(121);
  public static final short HIGH_HUMIDITY = (short)(122);
  public static final short HIGH_TEMPERATURE = (short)(123);
  public static final short HIGH_WIND = (short)(124);
  public static final short ICE_BUILD_UP = (short)(125);
  public static final short INTRUSION_DETECTION = (short)(126);
  public static final short LOW_FUEL = (short)(127);
  public static final short LOW_HUMIDITY = (short)(128);
  public static final short LOW_CABLE_PRESSURE = (short)(129);
  public static final short LOW_TEMPERATURE = (short)(130);
  public static final short LOW_WATER = (short)(131);
  public static final short SMOKE = (short)(132);
  public static final short TOXIC_GAS = (short)(133);

  // Values 134-135 correspond to duplicated probable causes
  public static final short EXTERNAL_POINT_FAILURE = (short)(136);

  // Values 137-150 are reserved for potential M.3100 future extensions
  public static final short STORAGE_CAPACITY_PROBLEM = (short)(151);
  public static final short MEMORY_MISMATCH = (short)(152);
  public static final short CORRUPT_DATA = (short)(153);
  public static final short OUT_OF_CPU_CYCLES = (short)(154);
  public static final short SOFTWARE_ENVIRONMENT_PROBLEM = (short)(155);
  public static final short SOFTWARE_DOWNLOAD_FAILURE = (short)(156);
  public static final short LOSS_OF_REAL_TIME = (short)(157);
  public static final short REINITIALIZED = (short)(158);

  // Values 201-202 correspond to duplicated probable causes
  public static final short EXCESSIVE_ERROR_RATE = (short)(203);

  /*
        Probable causes originating from X.721.
        Values below correspond to X.721 values with an offset of 300.
        */
  public static final short ADAPTER_ERROR = (short)(301);
  public static final short APPLICATION_SUBSYSTEM_FAILURE = (short)(302);
  public static final short BANDWIDTH_REDUCED = (short)(303);

  // Value 304 corresponds to a duplicated probable cause
  public static final short COMMUNICATIONS_PROTOCOL_ERROR = (short)(305);
  public static final short COMMUNICATIONS_SUBSYSTEM_FAILURE = (short)(306);
  public static final short CONFIGURATION_OR_CUSTOMIZATION_ERROR = (short)(307);
  public static final short CONGESTION = (short)(308);

  // Value 309 corresponds to a duplicated probable cause
  public static final short CPU_CYCLES_LIMIT_EXCEEDED = (short)(310);
  public static final short DATA_SET_OR_MODEM_ERROR = (short)(311);

  // Value 312 corresponds to a duplicated probable cause
  public static final short DTE_DCE_INTERFACE_ERROR = (short)(313);

  // Value 314 corresponds to a duplicated probable cause
  public static final short EQUIPMENT_MALFUNCTION = (short)(315);
  public static final short EXCESSIVE_VIBRATION = (short)(316);
  public static final short FILE_ERROR = (short)(317);

  // Values 318-320 correspond to duplicated probable causes
  public static final short HEATING_OR_VENTILATION_OR_COOLING_SYSTEM_PROBLEM = (short)(321);
  public static final short HUMIDITY_UNACCEPTABLE = (short)(322);
  public static final short INPUT_OUTPUT_DEVICE_ERROR = (short)(323);
  public static final short INPUT_DEVICE_ERROR = (short)(324);
  public static final short LAN_ERROR = (short)(325);
  public static final short LEAK_DETECTED = (short)(326);
  public static final short LOCAL_NODE_TRANSMISSION_ERROR = (short)(327);

  // Values 328-329 correspond to duplicated probable causes
  public static final short MATERIAL_SUPPLY_EXHAUSTED = (short)(330);

  // Value 331 corresponds to a duplicated probable cause
  public static final short OUT_OF_MEMORY = (short)(332);
  public static final short OUTPUT_DEVICE_ERROR = (short)(333);
  public static final short PERFORMANCE_DEGRADED = (short)(334);

  // Value 335 corresponds to a duplicated probable cause
  public static final short PRESSURE_UNACCEPTABLE = (short)(336);

  // Values 337-338 correspond to duplicated probable causes
  public static final short QUEUE_SIZE_EXCEEDED = (short)(339);
  public static final short RECEIVE_FAILURE = (short)(340);

  // Value 341 corresponds to a duplicated probable cause
  public static final short REMOTE_NODE_TRANSMISSION_ERROR = (short)(342);
  public static final short RESOURCE_AT_OR_NEARING_CAPACITY = (short)(343);
  public static final short RESPONSE_TIME_EXCESSIVE = (short)(344);
  public static final short RETRANSMISSION_RATE_EXCESSIVE = (short)(345);
  public static final short SOFTWARE_ERROR = (short)(346);
  public static final short SOFTWARE_PROGRAM_ABNORMALLY_TERMINATED = (short)(347);
  public static final short SOFTWARE_PROGRAM_ERROR = (short)(348);

  // Value 349 corresponds to a duplicated probable cause
  public static final short TEMPERATURE_UNACCEPTABLE = (short)(350);
  public static final short THRESHOLD_CROSSED = (short)(351);

  // Value 352 corresponds to a duplicated probable cause
  public static final short TOXIC_LEAK_DETECTED = (short)(353);
  public static final short TRANSMIT_FAILURE = (short)(354);

  // Value 355 corresponds to a duplicated probable cause
  public static final short UNDERLYING_RESOURCE_UNAVAILABLE = (short)(356);
  public static final short VERSION_MISMATCH = (short)(357);

  /*
        Probable causes for 2G & 3G wireless systems.
        */
  public static final short A_BIS_TO_BTS_INTERFACE_FAILURE = (short)(501);
  public static final short A_BIS_TO_TRX_INTERFACE_FAILURE = (short)(502);
  public static final short ANTENNA_PROBLEM = (short)(503);
  public static final short BATTERY_BREAKDOWN = (short)(504);
  public static final short BATTERY_CHARGING_FAULT = (short)(505);
  public static final short CLOCK_SYNCHRONIZATION_PROBLEM = (short)(506);
  public static final short COMBINER_PROBLEM = (short)(507);
  public static final short DISK_PROBLEM = (short)(508);

  // Value 509 corresponds to a duplicated probable cause
  public static final short EXCESSIVE_RECEIVER_TEMPERATURE = (short)(510);
  public static final short EXCESSIVE_TRANSMITTER_OUTPUT_POWER = (short)(511);
  public static final short EXCESSIVE_TRANSMITTER_TEMPERATURE = (short)(512);
  public static final short FREQUENCY_HOPPING_DEGRADED = (short)(513);
  public static final short FREQUENCY_HOPPING_FAILURE = (short)(514);
  public static final short FREQUENCY_REDEFINITION_FAILED = (short)(515);
  public static final short LINE_INTERFACE_FAILURE = (short)(516);
  public static final short LINK_FAILURE = (short)(517);
  public static final short LOSS_OF_SYNCHRONIZATION = (short)(518);
  public static final short LOST_REDUNDANCY = (short)(519);
  public static final short MAINS_BREAKDOWN_WITH_BATTERY_BACKUP = (short)(520);
  public static final short MAINS_BREAKDOWN_WITHOUT_BATTERY_BACKUP = (short)(521);
  public static final short POWER_SUPPLY_FAILURE = (short)(522);
  public static final short RECEIVER_ANTENNA_FAULT = (short)(523);

  // Value 524 corresponds to a duplicated probable cause
  public static final short RECEIVER_MULTICOUPLER_FAILURE = (short)(525);
  public static final short REDUCED_TRANSMITTER_OUTPUT_POWER = (short)(526);
  public static final short SIGNAL_QUALITY_EVALUATION_FAULT = (short)(527);
  public static final short TIMESLOT_HARDWARE_FAILURE = (short)(528);
  public static final short TRANSCEIVER_PROBLEM = (short)(529);
  public static final short TRANSCODER_PROBLEM = (short)(530);
  public static final short TRANSCODER_OR_RATE_ADAPTER_PROBLEM = (short)(531);
  public static final short TRANSMITTER_ANTENNA_FAILURE = (short)(532);
  public static final short TRANSMITTER_ANTENNA_NOT_ADJUSTED = (short)(533);

  // Value 534 corresponds to a duplicated probable cause
  public static final short TRANSMITTER_LOW_VOLTAGE_OR_CURRENT = (short)(535);
  public static final short TRANSMITTER_OFF_FREQUENCY = (short)(536);
  public static final short DATABASE_INCONSISTENCY = (short)(537);
  public static final short FILE_SYSTEM_CALL_UNSUCCESSFUL = (short)(538);
  public static final short INPUT_PARAMETER_OUT_OF_RANGE = (short)(539);
  public static final short INVALID_PARAMETER = (short)(540);
  public static final short INVALID_POINTER = (short)(541);
  public static final short MESSAGE_NOT_EXPECTED = (short)(542);
  public static final short MESSAGE_NOT_INITIALIZED = (short)(543);
  public static final short MESSAGE_OUT_OF_SEQUENCE = (short)(544);
  public static final short SYSTEM_CALL_UNSUCCESSFUL = (short)(545);
  public static final short TIMEOUT_EXPIRED = (short)(546);
  public static final short VARIABLE_OUT_OF_RANGE = (short)(547);
  public static final short WATCH_DOG_TIMER_EXPIRED = (short)(548);
  public static final short COOLING_SYSTEM_FAILURE = (short)(549);
  public static final short EXTERNAL_EQUIPMENT_FAILURE = (short)(550);
  public static final short EXTERNAL_POWER_SUPPLY_FAILURE = (short)(551);
  public static final short EXTERNAL_TRANSMISSION_DEVICE_FAILURE = (short)(552);

  // Values 553-560 correspond to duplicated probable causes
  public static final short REDUCED_ALARM_REPORTING = (short)(561);
  public static final short REDUCED_EVENT_REPORTING = (short)(562);
  public static final short RECUCED_LOGGING_CAPABILITY = (short)(563);
  public static final short SYSTEM_RESOURCES_OVERLOAD = (short)(564);
  public static final short BROADCAST_CHANNEL_FAILURE = (short)(565);
  public static final short CONNECTION_ESTABLISHMENT_ERROR = (short)(566);
  public static final short INVALID_MESSAGE_RECEIVED = (short)(567);
  public static final short INVALID_MSU_RECEIVED = (short)(568);
  public static final short LAPD_LINK_PROTOCOL_FAILURE = (short)(569);
  public static final short LOCAL_ALARM_INDICATION = (short)(570);
  public static final short REMOTE_ALARM_INDICATION = (short)(571);
  public static final short ROUTING_FAILURE = (short)(572);
  public static final short SS7_PROTOCOL_FAILURE = (short)(573);
  public static final short TRANSMISSION_ERROR = (short)(574);

  /*
        Probable causes originating from M.3100 security alarm causes.
        Values below correspond to M.3100 values with an offset of 700.
        */
  public static final short AUTHENTICATION_FAILURE = (short)(701);
  public static final short BREACH_OF_CONFIDENTIALITY = (short)(702);
  public static final short CABLE_TAMPER = (short)(703);
  public static final short DELAYED_INFORMATION = (short)(704);
  public static final short DENIAL_OF_SERVICE = (short)(705);
  public static final short DUPLICATE_INFORMATION = (short)(706);
  public static final short INFORMATION_MISSING = (short)(707);
  public static final short INFORMATION_MODIFICATION_DETECTED = (short)(708);
  public static final short INFORMATION_OUT_OF_SEQUENCE = (short)(709);

  // Value 710 corresponds to a duplicated probable cause
  public static final short KEY_EXPIRED = (short)(711);
  public static final short NON_REPUDIATION_FAILURE = (short)(712);
  public static final short OUT_OF_HOURS_ACTIVITY = (short)(713);
  public static final short OUT_OF_SERVICE = (short)(714);
  public static final short PROCEDURAL_ERROR = (short)(715);
  public static final short UNAUTHORISED_ACCESS_ATTEMPT = (short)(716);
  public static final short UNEXPECTED_INFORMATION = (short)(717);
  public static final short UNSPECIFIED_REASON = (short)(718);
} // interface ProbableCause
