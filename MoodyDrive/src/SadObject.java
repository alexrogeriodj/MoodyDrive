/* 
*
 * @author Alex Rogério
 * @date 07/03/2017
 */


public class SadObject extends MoodyObject {
    public void cry(){
        System.out.println("buuuuuuaaaaabuuuuaaaa");
    }
    
    @Override
    protected String getMood(){
        return "triste";
    }
 
}
