package xyzhealthcare.healthcareeligibility;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Customer implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "state")
   private java.lang.String state;
   @org.kie.api.definition.type.Label(value = "income")
   private java.lang.Float income;
   @org.kie.api.definition.type.Label(value = "elegibilty")
   private java.lang.Boolean eligibility;

   public Customer()
   {
   }

   public java.lang.String getState()
   {
      return this.state;
   }

   public void setState(java.lang.String state)
   {
      this.state = state;
   }

   public java.lang.Float getIncome()
   {
      return this.income;
   }

   public void setIncome(java.lang.Float income)
   {
      this.income = income;
   }

   public java.lang.Boolean getEligibility()
   {
      return this.eligibility;
   }

   public void setEligibility(java.lang.Boolean eligibility)
   {
      this.eligibility = eligibility;
   }

   public Customer(java.lang.String state, java.lang.Float income,
         java.lang.Boolean eligibility)
   {
      this.state = state;
      this.income = income;
      this.eligibility = eligibility;
   }

}