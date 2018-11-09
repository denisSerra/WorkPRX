/**
 * ResponseConto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public class ResponseConto  extends webservice.ResponseBase  implements java.io.Serializable {
    private webservice.ContoCorrente[] arrayListCC;

    public ResponseConto() {
    }

    public ResponseConto(
           int errorCode,
           java.lang.String errorDesc,
           java.lang.String result,
           webservice.ContoCorrente[] arrayListCC) {
        super(
            errorCode,
            errorDesc,
            result);
        this.arrayListCC = arrayListCC;
    }


    /**
     * Gets the arrayListCC value for this ResponseConto.
     * 
     * @return arrayListCC
     */
    public webservice.ContoCorrente[] getArrayListCC() {
        return arrayListCC;
    }


    /**
     * Sets the arrayListCC value for this ResponseConto.
     * 
     * @param arrayListCC
     */
    public void setArrayListCC(webservice.ContoCorrente[] arrayListCC) {
        this.arrayListCC = arrayListCC;
    }

    public webservice.ContoCorrente getArrayListCC(int i) {
        return this.arrayListCC[i];
    }

    public void setArrayListCC(int i, webservice.ContoCorrente _value) {
        this.arrayListCC[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseConto)) return false;
        ResponseConto other = (ResponseConto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.arrayListCC==null && other.getArrayListCC()==null) || 
             (this.arrayListCC!=null &&
              java.util.Arrays.equals(this.arrayListCC, other.getArrayListCC())));
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
        if (getArrayListCC() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArrayListCC());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArrayListCC(), i);
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
        new org.apache.axis.description.TypeDesc(ResponseConto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice/", "responseConto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrayListCC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrayListCC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice/", "contoCorrente"));
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
