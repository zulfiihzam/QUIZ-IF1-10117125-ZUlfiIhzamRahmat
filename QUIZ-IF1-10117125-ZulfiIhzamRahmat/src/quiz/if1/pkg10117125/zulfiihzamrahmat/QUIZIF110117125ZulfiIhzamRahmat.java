/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if1.pkg10117125.zulfiihzamrahmat;
import java.util.Scanner;

/**
 *
 * nama : Zulfi Ihzam Rahmat
 * NIM : 10117125
 * kelas : IF-1
 * deskripsi projek : 
 */
public class QUIZIF110117125ZulfiIhzamRahmat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("====Program Kasir Rock n Roll Haircut====");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        Customer c = new Customer();
        System.out.print("Customer Name : ");
        c.setName(sc1.nextLine());
        System.out.print("Customer Email : ");
        c.setEmail(sc2.next());
        c.displayService();
        c.setPriceService(c.getPrice(sc4.nextInt()));
        System.out.print("Are you Member (yes/no) : ");
        c.setMember(c.checkMemberStatus(sc3.next()));
        System.out.println("\n");
        System.out.println("#*******************************#");
        System.out.println("#********CUSTOMER INVOICE*******#");
        System.out.println("Date Transaction : "+c.currentTime());
        System.out.println("Service Price : Rp." + c.getPriceService());
        System.out.println("Discount : Rp." + c.getSale(c.isMember(), c.getPriceService()));
        System.out.println("Total Pay : Rp." + c.getTotalPay(c.getPriceService(),
        c.getSale(c.isMember(), c.getPriceService())));
    }
    
}
