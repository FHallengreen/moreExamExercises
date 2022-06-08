package exercise19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

    public class Dream implements Comparable<Dream>{

        public String getDate() {
            return date;
        }

        private String date;
        private int duration;
        private Drømmetype type;

        public Dream(String date, int duration, Drømmetype type) {
            this.date = date;
            this.duration = duration;
            this.type = type;
        }

        public boolean isPleasant (){
            if (Drømmetype.MARERIDT == type){
                return false;
            }
            else if (Drømmetype.VÅD == type && duration < 10){
                return true;
            }
            else if (Drømmetype.TØR == type && duration > 10){
                return true;
            }
            return false;
        }

        public static void main(String[] args) {
            Dream dream = new Dream("31/05/2022",15,Drømmetype.VÅD);
            Dream dream2 = new Dream("05/05/2022",5,Drømmetype.VÅD);
            Dream dream3 = new Dream("12/06/2022",5,Drømmetype.VÅD);
            System.out.println(dream.isPleasant());
            ArrayList<Dream> dreamlist = new ArrayList<>();
            dreamlist.add(dream);
            dreamlist.add(dream2);
            dreamlist.add(dream3);
            System.out.println(dreamlist);
            Collections.sort(dreamlist,new Compare());
            System.out.println(dreamlist);
        }

        public String toString(){
            return date;
        }

        @Override
        public int compareTo(Dream o) {

            return this.date.compareTo(o.date);
        }
    }
