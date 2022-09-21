import java.util.Random;

class Attendance {

    void Attendance1() {
        Random random = new Random();
        int Empcheck = random.nextInt(0, 2);
        if(Empcheck==1){
            System.out.println("PRESENT");
        }else
        {
            System.out.println("ABSENT");
        }
    }
}
