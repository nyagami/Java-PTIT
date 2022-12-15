
package nyagami;
import java.io.*;
import java.util.*;
import view.InvoiceView;
import vn.edu.ptit.*;
/**
 *
 * @author hoang
 */


public class Nyagami {
    
    static class PaymentController{
        private Invoice invoice;
        
        public PaymentController(){
            Scanner sc = new Scanner(System.in);
            
            Student st = new Student(sc.nextLine(), sc.nextLine());
            
            int n_subject = Integer.parseInt(sc.nextLine());
            ArrayList<Subject> AlSubject = new ArrayList<>();
            
            for(int i=0; i<n_subject;i++){
                String code = sc.nextLine();
                String name = sc.nextLine();
                AlSubject.add(new Subject(name, code, Integer.parseInt(sc.nextLine())));
            }
            
            Rule rule = new Rule(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            
            invoice = new Invoice(rule);
            invoice.setSt(st);
            invoice.setAlSubject(AlSubject);
            double amount = 0;
            for(Subject sj: AlSubject){
                amount += sj.getCredit()*rule.getCreditPrice();
            }
            invoice.setAmount(amount);
        }
        
        public Invoice getInvoice(){
            return invoice;
        }
    }
    
    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        //Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
    public static void main5399814(String[] args) {
      PaymentController pc = new PaymentController();
      //Output for test
      Invoice invoice = pc.getInvoice();
      InvoiceView.show(invoice);
  }
}

