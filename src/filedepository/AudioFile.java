package filedepository;

/**
 * Created by Daniel Solo on 06.03.2016.
 */
public class AudioFile extends File {
        public AudioFile() {
                setName("Spanish Sahara.mp3");
        }

        public void Open(){
                System.out.println("Playing music Spanish Sahara By Foals");
        }
}
