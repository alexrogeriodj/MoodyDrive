/* 
*
 * @author Alex Rogério
 * @date 07/03/2017
 */


public class MoodyObject {
    
    protected String getMood(){
        return "moody";
    }
    
    public void queryMood(){
        System.out.println("I feel " + getMood() + " today!");
    }
}
