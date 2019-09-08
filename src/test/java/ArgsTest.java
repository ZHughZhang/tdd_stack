
import Args.ArgsParser;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ArgsTest {

    @Test
    public void should_paser_args_with_schema(){

        ArgsParser argsParser = new ArgsParser("l:bool p:int d:string");
            String[] args = new String[]{"-l","-p","8080","-d","/usr/log"};
            argsParser.paser(args);

        assertThat((boolean)argsParser.getValue("l")).isTrue();//true
        assertThat(argsParser.getValue("p")).isEqualTo(8080);//8080
        assertThat(argsParser.getValue("d")).isEqualTo("/usr/log");// /usr/log

    }
}
