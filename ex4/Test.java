
import com.automobile.twowheeler.*;

public class Test {
    public static void main(String [] args){
        Hero hr = new Hero();
        System.out.println("Model name:"+hr.getModelName());
        System.out.println("Registration number:"+hr.getRegistrationNumber());
        System.out.println("Owner name:"+hr.getOwnerName());
        System.out.println("Speed:"+hr.getSpeed());
        hr.radio();

        Honda hn = new Honda();
        System.out.println("Model name:"+hn.getModelName());
        System.out.println("Registration number:"+hn.getRegistrationNumber());
        System.out.println("Owner name:"+hn.getOwnerName());
        System.out.println("Speed:"+hn.getSpeed());
        hn.cdplayer();
    }
}
