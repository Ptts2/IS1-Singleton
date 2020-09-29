package ule.iso1.singleton;



public class VATtoApply {

   
    private double vatType;
    private static VATtoApply instance;
    
    /**
     * MODIFICAR PARA CONSEGUIR QUE SEA SINGLETON
     */

    private VATtoApply(double vat) {
    	vatType=vat;
    }
  
   public static VATtoApply getInstance(double vat) {
	   if(instance == null)
		   instance = new VATtoApply(vat);
	   return instance;
   }

	public double getVatType() {
		return vatType;
	}

	public void setVatType(double vatType) {
		this.vatType = vatType;
	}

}