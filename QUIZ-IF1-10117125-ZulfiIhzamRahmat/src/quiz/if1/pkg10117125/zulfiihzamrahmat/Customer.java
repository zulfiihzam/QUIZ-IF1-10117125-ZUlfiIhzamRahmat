/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if1.pkg10117125.zulfiihzamrahmat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author Zulfi
 */
public class Customer extends ServicePrize implements CustomerInvoice{
    private String name;
    private String email;
    private boolean member;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isMember() {
        return member;
    }
    public void setMember(boolean member) {
        this.member = member;
    }

    public String currentTime() {
        SimpleDateFormat cdt = new SimpleDateFormat("EEEEEE, d MMM yyyy HH:mm:ss");
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("Asia/Jakarta")));
        return cdt.format(System.currentTimeMillis());
    }
    
}
