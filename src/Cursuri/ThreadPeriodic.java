package Cursuri;

import Cursuri.Institutie;

public class ThreadPeriodic extends  Thread{
    private boolean isRunning = false;

    public void run() {
        while (isRunning == false) {
            System.out.println("Institutia are " + Institutie.nrCursuriExistente + " cursuri in derulare! ");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopThread(){
        isRunning = true;
    }
}
