package com.zzhw.gtms.rocketmq.producer;

import com.zzhw.gtms.core.mq.rocket.ProducerHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AsnProducer {

    @Autowired
    ProducerHelper producerHelper;

    private static final Logger log = LoggerFactory.getLogger(AsnProducer.class);

//    public SendResult createAsn(GtmsCodeHeaderDto AsnDto asnDto) throws Exception {
//        return producerHelper.send(MqConstants.TOPIC_ASN, MqConstants.TAG_ASN_CREATE,asnDto,asnDto.getReferNo(),"");
//    }
//
//    public SendResult cacelAsn(AsnDto asnDto) throws Exception {
//        return producerHelper.send(MqConstants.TOPIC_ASN, MqConstants.TAG_ASN_CACEL,asnDto,asnDto.getReferNo(),"");
//    }
}
