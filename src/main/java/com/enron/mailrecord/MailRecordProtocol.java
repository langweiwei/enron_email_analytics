/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.enron.mailrecord;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface MailRecordProtocol {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"MailRecordProtocol\",\"namespace\":\"com.enron.mailrecord\",\"version\":\"1.0.0\",\"types\":[{\"type\":\"record\",\"name\":\"Attachment\",\"fields\":[{\"name\":\"fileName\",\"type\":\"string\"},{\"name\":\"size\",\"type\":\"int\"},{\"name\":\"mimeType\",\"type\":\"string\"},{\"name\":\"data\",\"type\":\"bytes\"}]},{\"type\":\"record\",\"name\":\"MailRecord\",\"fields\":[{\"name\":\"uuid\",\"type\":\"string\"},{\"name\":\"from\",\"type\":\"string\"},{\"name\":\"to\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"default\":null},{\"name\":\"cc\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"default\":null},{\"name\":\"bcc\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"default\":null},{\"name\":\"dateUtcEpoch\",\"type\":\"long\"},{\"name\":\"subject\",\"type\":\"string\"},{\"name\":\"mailFields\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"default\":null},{\"name\":\"body\",\"type\":\"string\"},{\"name\":\"attachments\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Attachment\"}],\"default\":null}]}],\"messages\":{}}");

  @SuppressWarnings("all")
  public interface Callback extends MailRecordProtocol {
    public static final org.apache.avro.Protocol PROTOCOL = MailRecordProtocol.PROTOCOL;
  }
}