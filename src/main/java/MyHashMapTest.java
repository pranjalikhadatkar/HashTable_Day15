import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTest {

    @Test
    public void givenASentence_WhenWordsAreAddedToListShouldReturnWordFrequency(){
        String sentence = "“Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situation ";
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        String[] words = sentence.toLowerCase().split( " ");
        for (String word : words) {
            Integer value =  myHashMap.get(word);
            if(value == null) {
                value =1;
            }
            else {
                value = value + 1;
            }
            myHashMap.add(word, value);
        }
        int frequency = myHashMap.get("paranoid");
        System.out.println(myHashMap);
          System.out.println("Frequency of paranoid is: "+frequency);
        Assert.assertEquals( 3,frequency );
    }
}
