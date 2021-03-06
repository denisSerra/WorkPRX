/**
 * RequestContoCorrente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public class RequestContoCorrente  extends webservice.RequestBase  implements java.io.Serializable {
    private java.lang.String codicefiscale;

    private java.lang.String dataInizio;

    private int idConto;

    private double saldo;

    public RequestContoCorrente() {
    }

    public RequestContoCorrente(
           java.lang.String codicefiscale,
           java.lang.String dataInizio,
           int idConto,
           double saldo) {
        this.codicefiscale = codicefiscale;
        this.dataInizio = dataInizio;
        this.idConto = idConto;
        this.saldo = saldo;
    }


    /**
     * Gets the codicefiscale value for this RequestContoCorrente.
     * 
     * @return codicefiscale
     */
    public java.lang.String getCodicefiscale() {
        return codicefiscale;
    }


    /**
     * Sets the codicefiscale value for this RequestContoCorrente.
     * 
     * @param codicefiscale
     */
    public void setCodicefiscale(java.lang.String codicefiscale) {
        this.codicefiscale = codicefiscale;
    }


    /**
     * Gets the dataInizio value for this RequestContoCorrente.
     * 
     * @return dataInizio
     */
    public java.lang.String getDataInizio() {
        return dataInizio;
    }


    /**
     * Sets the dataInizio value for this RequestContoCorrente.
     * 
     * @param dataInizio
     */
    public void setDataInizio(java.lang.String dataInizio) {
        this.dataInizio = dataInizio;
    }


    /**
     * Gets the idConto value for this RequestContoCorrente.
     * 
     * @return idConto
     */
    public int getIdConto() {
        return idConto;
    }


    /**
     * Sets the idConto value for this RequestContoCorrente.
     * 
     * @param idConto
     */
    public void setIdConto(int idConto) {
        this.idConto = idConto;
    }


    /**
     * Gets the saldo value for this RequestContoCorrente.
     * 
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }


    /**
     * Sets the saldo value for this RequestContoCorrente.
     * 
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestContoCorrente)) return false;
        RequestContoCorrente other = (RequestContoCorrente) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.codicefiscale==null && other.getCodicefiscale()==null) || 
             (this.codicefiscale!=null &&
              this.codicefiscale.equals(other.getCodicefiscale()))) &&
            ((this.dataInizio==null && other.getDataInizio()==null) || 
             (this.dataInizio!=null &&
              this.dataInizio.equals(other.getDataInizio()))) &&
            this.idConto == other.getIdConto() &&
            this.saldo == other.getSaldo();
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
        if (getCodicefiscale() != null) {
            _hashCode += getCodicefiscale().hashCode();
        }
        if (getDataInizio() != null) {
            _hashCode += getDataInizio().hashCode();
        }
        _hashCode += getIdConto();
        _hashCode += new Double(getSaldo()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestContoCorrente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice/", "requestContoCorrente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codicefiscale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codicefiscale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInizio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataInizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anySimpleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idConto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idConto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saldo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "saldo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
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
