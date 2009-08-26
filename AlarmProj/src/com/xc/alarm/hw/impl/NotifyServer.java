package com.xc.alarm.hw.impl;

import CosEventComm.Disconnected;
import CosNotification.EventType;
import CosNotification.StructuredEvent;
import CosNotifyComm.InvalidEventType;
import CosNotifyComm.SequencePushConsumerPOA;

public class NotifyServer extends SequencePushConsumerPOA {

	public void disconnect_sequence_push_consumer() {
		// TODO Auto-generated method stub
		System.out.println("aaa");
	}

	public void push_structured_events(StructuredEvent[] arg0)
			throws Disconnected {
		// TODO Auto-generated method stub
		System.out.println("bbb");
	}

	public void offer_change(EventType[] arg0, EventType[] arg1)
			throws InvalidEventType {
		// TODO Auto-generated method stub
		System.out.println("ccc");
	}



}
