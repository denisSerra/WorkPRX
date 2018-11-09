/**
 * Movimento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public class Movimento  implements java.io.Serializable {
    private java.lang.String causale;

    private java.lang.String data;

    private int idConto;

    private int idMovimento;

    private int idTipoMovimento;

    private double importo;

    public Movimento() {
    }

    public Movimento(
           java.lang.String causale,
           java.lang.String data,
           int idConto,
           int idMovimento,
           int idTipoMovimento,
           double importo) {
           this.causale = causale;
           this.data = data;
           this.idConto = idConto;
           this.idMovimento = idMovimento;
           this.idTipoMovimento = idTipoMovimento;
           this.importo = importo;
    }


    /**
     * Gets the causale value for this Movimento.
     * 
     * @return causale
     */
    public java.lang.String getCausale() {
        return causale;
    }


    /**
     * Sets the causale value for this Movimento.
     * 
     * @param causale
     */
    public void setCausale(java.lang.String causale) {
        this.causale = causale;
    }


    /**
     * Gets the data value for this Movimento.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this Movimento.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }


    /**
     * Gets the idConto value for this Movimento.
     * 
     * @return idConto
     */
    public int getIdConto() {
        return idConto;
    }


    /**
     * Sets the idConto value for this Movimento.
     * 
     * @param idConto
     */
    public void setIdConto(int idConto) {
        this.idConto = idConto;
    }


    /**
     * Gets the idMovimento value for this Movimento.
     * 
     * @return idMovimento
     */
    public int getIdMovimento() {
        return idMovimento;
    }


    /**
     * Sets the idMovimento value for this Movimento.
     * 
     * @param idMovimento
     */
    public void setIdMovimento(int idMovimento) {
        this.idMovimento = idMovimento;
    }


    /**
     * Gets the idTipoMovimento value for this Movimento.
     * 
     * @return idTipoMovimento
     */
    public int getIdTipoMovimento() {
        return idTipoMovimento;
    }


    /**
     * Sets the idTipoMovimento value for this Movimento.
     * 
     * @param idTipoMovimento
     */
    public void setIdTipoMovimento(int idTipoMovimento) {
        this.idTipoMovimento = idTipoMovimento;
    }


    /**
     * Gets the importo value for this Movimento.
     * 
     * @return importo
     */
    public double getImporto() {
        return importo;
    }


    /**
     * Sets the importo value for this Movimento.
     * 
     * @param importo
     */
    public void setImporto(double importo) {
        this.importo = importo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Movimento)) return false;
        Movimento other = (Movimento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.causale==null && other.getCausale()==null) || 
             (this.causale!=null &&
              this.causale.equals(other.getCausale()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            this.idConto == other.getIdConto() &&
            this.idMovimento == other.getIdMovimento() &&
            this.idTipoMovimento == other.getIdTipoMovimento() &&
            this.importo == other.getImporto();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCausale() != null) {
            _hashCode += getCausale().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        _hashCode += getIdConto();
        _hashCode += getIdMovimento();
        _hashCode += getIdTipoMovimento();
        _hashCode += new Double(getImporto()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Movimento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice/", "movimento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "causale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
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
        elemField.setFieldName("idMovimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idMovimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTipoMovimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idTipoMovimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "importo"));
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
