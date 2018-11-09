/**
 * ResponseMovimento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public class ResponseMovimento  extends webservice.ResponseBase  implements java.io.Serializable {
    private webservice.Movimento[] arrayListMovimento;

    public ResponseMovimento() {
    }

    public ResponseMovimento(
           int errorCode,
           java.lang.String errorDesc,
           java.lang.String result,
           webservice.Movimento[] arrayListMovimento) {
        super(
            errorCode,
            errorDesc,
            result);
        this.arrayListMovimento = arrayListMovimento;
    }


    /**
     * Gets the arrayListMovimento value for this ResponseMovimento.
     * 
     * @return arrayListMovimento
     */
    public webservice.Movimento[] getArrayListMovimento() {
        return arrayListMovimento;
    }


    /**
     * Sets the arrayListMovimento value for this ResponseMovimento.
     * 
     * @param arrayListMovimento
     */
    public void setArrayListMovimento(webservice.Movimento[] arrayListMovimento) {
        this.arrayListMovimento = arrayListMovimento;
    }

    public webservice.Movimento getArrayListMovimento(int i) {
        return this.arrayListMovimento[i];
    }

    public void setArrayListMovimento(int i, webservice.Movimento _value) {
        this.arrayListMovimento[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseMovimento)) return false;
        ResponseMovimento other = (ResponseMovimento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.arrayListMovimento==null && other.getArrayListMovimento()==null) || 
             (this.arrayListMovimento!=null &&
              java.util.Arrays.equals(this.arrayListMovimento, other.getArrayListMovimento())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getArrayListMovimento() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArrayListMovimento());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArrayListMovimento(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseMovimento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice/", "responseMovimento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrayListMovimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrayListMovimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice/", "movimento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
