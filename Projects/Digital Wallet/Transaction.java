public abstract class Transaction implements Transactable{
        protected int transactionId;
        protected String timeStamp;
        protected double amount;

        // Methods 
        public abstract String getDetails();

}//Transaction