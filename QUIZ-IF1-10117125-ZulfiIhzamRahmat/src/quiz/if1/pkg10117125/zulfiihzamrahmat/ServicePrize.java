/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if1.pkg10117125.zulfiihzamrahmat;

/**
 *
 * @author User
 */
public class ServicePrize implements ServiceItem {
    private float priceService;
    private float discount;
    public float getPriceService() {
        return priceService;
    }
    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }

    @Override
    public void displayService() {
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash: IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#*************************#");
        System.out.print("Choose (1/2/3): ");
    }
    
    @Override
    public float getPrice(int serviceItem) {
        float price;
        switch (serviceItem) {
            case 1:
            price = 45000;
            break;
            case 2:
            price = 55000;
            break;
            case 3:
            price = 15000;
            break;
            default:
            price = 0;
            break;
        };
    return price;
    }

    // untuk mengecek status apakah member
    public boolean checkMemberStatus(String statusMember) {
        statusMember = statusMember.toLowerCase();
        return statusMember.equals("yes") ? true : false;
    }

    
    // untuk perhitungan diskon
    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        if (isMember == true) {
            discount = (10 * parServicePrice) / 100;
        } else {
            discount = 0;
        }
    return discount;
    }
    
    // untuk mendapatkan harga akhir dari harga barang - diskon
    public float getTotalPay(float priceService, float discount) {
        return priceService - discount;
    }
    
}
