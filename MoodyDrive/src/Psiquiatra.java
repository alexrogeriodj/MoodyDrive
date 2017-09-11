

/**
 * @author Alex Rogério
 */
public class Psiquiatra {

    public void examinar( MoodyObject paciente ) {
        System.out.println("Como voc� se sente hoje?\n");
        paciente.queryMood();
    }

    public void observar( HappyObject sujeitoFeliz ){
        sujeitoFeliz.laugh();
    }

    public void observar( SadObject sujeitoTriste ){
        sujeitoTriste.cry();
    }


}
