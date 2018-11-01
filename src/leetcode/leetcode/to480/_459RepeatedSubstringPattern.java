package leetcode.leetcode.to480;

/**
 * Created by SNAILQQ on 9/20/17.
 * Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.

 Example 1:
 Input: "abab"

 Output: True

 Explanation: It's the substring "ab" twice.
 Example 2:
 Input: "aba"

 Output: False
 Example 3:
 Input: "abcabcabcabc"

 Output: True

 Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
 */
public class _459RepeatedSubstringPattern {
  public static boolean repeatedSubstringPattern(String s) {
    if (s == null || s.length() == 0) {
      return false;
    }

    if (s.length() == 1) {
      return true;
    }

    for (int i = 2; i <= s.length(); i++) {
      System.out.println(s.length());
      boolean flg = true;
      if (s.length() % i != 0) {
        continue;
      }
      int j;
      for (j = 0; j < s.length() / i; j++) {
        int k;
        char letter = s.charAt(j);
        for (k = 2; k <= i; k++) {
          char aLetter = s.charAt((s.length() / i) * (k - 1) + j);
          if (letter != aLetter) {
            flg = false;
            break;
          }
        }
        if(flg == false && k <= i) {
          flg = true;
          break;
        }
        if (j == s.length() / i -1) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    String a = "";
    String b = "xkmjusbyzqmvtevwpmthhrfzdazynvnxddhcxnjkjqdfrauwcjqwnqlysaflwpxlpmyswsiwrrzynpmrkz"
        + "umclbactekxovxlarnvcnhoqqvuijwedthfdqbxamvtaoaralzaloqpgtwyfykvfvtrbqifxotohowqgilnimfxm"
        + "gctxpiadtwozvwsmwwmqcglqxhifppssnrirwobfuppvdvyndcgkgymzmzdgsgvyvikgtfftachuzoiqpvtkmzbc"
        + "drbvxrwrzzrsjkaheeufwtsmunyczvyuktyoczcpugjncdatlzcdrkmstrzzqsagyhnckmozxizmmguqmsepnjah"
        + "mtdjhayvdasyhyytxsyfxghaqeddbirmhofyxzbsusfgghuhfuryrixgibqnjdkiskurwvgnxczuyxrncjjemfal"
        + "yupqsqncidzynjozzbrpdecmnmkalxtahrrrtaricvxnvzlkgbtrubbqfdxsotzdadqifxrjwxlbocksoxkzclqo"
        + "pxtanwdckutdardcmczjcgfrqtzsrejlaojqgbdudkpdbhpppmkbufzpecxkhupbrfsrueafwnlykjkimuimlivq"
        + "iocximjfmqvbadbshzykftfajcgjrxwsfrxfniyvphfchxvvhzqwqhhuznwskduiffmmctaamdwlwtitsyremdxx"
        + "xcuwupudozqbjqatqpjiznaaopcqdiacxbzcgtuajxskqmgernumigtkuaprciqdrpkjghjijkmrzdnnlkxlpuuz"
        + "bdzwzpocncwizjmvvnbkofgndrewdkjinjgewxhgpfugdcyehsyeefgtuvgwvjrjtwadfwxvoihggelmyltnbnop"
        + "jxojgsakopntiknhgzwkeafipguowkoxfydkprhmnjrmilnwwpnrtcjdtvgydliomxulcmfgjoppecsqbtdyhebx"
        + "huuatpufmgxomqooapksgoflsvsxmzwcaobegpwoclwtvirunfvsoeuwvgkjyyjhprechvpzpmodzywgzebagamb"
        + "trunnzgphdpfsbasjftdlfrdjmqagjykhiqpmhntzmpyszrtqzablkvaojjczdfiwbhxhiettmcpkmsvqvcbrcfm"
        + "ksctxzmlcrmlqqaffsbnnykxbevzgzksbnvpenhiqhvnpqosgftbvqzyxkbbaubtmphfpqbzdbstksmoqfrarssmv"
        + "kejtugdlgvfwdkmyygxivcvqefovxffeahhercrvnqwzbnhljyghfpdghwpsepnlgzyoguryfbjtdujwhuqgnnpl"
        + "tktivudedotackybqmjaqeyvltugstkbpfyyhpcvrumcoyjjubajdffbvkhgzxzjjnfvsxkpijgtuomyvsvofxvj"
        + "ieeydghwaecobeyanyviamvadugkynmyplglbytgprxyirlkyljfedpzxdpqwfqwoqqgvzpyngnhjivpxygylpbd"
        + "zldgowtdfwhsntwhiqxgyeupgtwzeryyayyijoslpxdkdbcvnebssentbsbjyyisvzkcpgvvrfbvctakeqjoagpr"
        + "yiomvvyoelxwlmtzglgnwuugiaygkemtlfcfrlwedclfuzapfaygzoxsojomopavsenttulxwytlkathrbcffstl"
        + "cqdtxvxopdpcynqrdxxkovfmggmrivmismrvfxxgpnmfwljaqvxswvddmhifxbglawvpvlwngdxdcjlzskcftyjg"
        + "dftlrscydmkhuxumipwhayqmzgfkutvpmtrkiyfoujuvhuitfyqveotmcsogvqecsvmypbdmhixhkoxoxkchfasq"
        + "qxnlpvywovrsmczddtehlhgohkxkrjqkxoiizktkdnvrafylmewszyjxcafpkuwlpumbtyduuosbrkwxcjtllcba"
        + "bixjcrkjggscvathtpfvnkggmrmpggotxwldnutuumlluzydmjsdjxkhhleqgnscwmcomeumvxelzmeviilvhhpf"
        + "vcpiglojvedlekxzkpfwfhsxkkdxaxejhsogdrmswsqzzknjmyofqyizhfzhsvvfjrgevckxohrzibmmfgkfksty"
        + "fxgpkzakrdpjmwfzqkgxqozsxuvlzebmfpopfftwmmtuceuenqkwqxccsucxefmxbsynvqpxbxsgkzzpyzzsfpyx"
        + "prgjkqasqomtiecorwtzgbowpyeforenkynnlxvirkdqheqscagercihvhhfprlrghjgaewericdvstgozaoxzhv"
        + "zsxjrvwcdxfsriczsqubkpzhdlxsuyyckwptrriyeniypjdjrongpquetrfvusnahwlvslrgdizvkfkatwbfrxke"
        + "yvlkrsrhqyjzjebaszrkypxqhotlyafvqjqegeorcmwqqotxtjiptxzfkvopzrxejevcaksnvbpjufdgdrcxmlwl"
        + "ieldommatbwpedhlvkpeaxoknsuksekjlfnzlbsgfjumqxngxoulmhvxtrkezgbqzatdoegqqxxctbnbbxcmpbvz"
        + "zalzklsbhvxsyarjzakxjgbdrmtgwftjjxtorxdqsgljmarshuoejfrjamcpoxbmqyskdarjrprhevccfwintwsj"
        + "jpjlecgylpurxfgpxodoppemciodpziunmdkeqyakzxpnkdsatdfaukoxiagdcrzdjjlfarxxhwxnfgsfrldtgcj"
        + "jdhraewyaugwvgxarlbnhvcdpbngnorecvmcvadmzxmajenvenehpktnwcocazbzmwdbjctkoqlngoyjjdaqfzoh"
        + "niuxspobnlaqegyilziigrmmahjghxefrxgyxwzomwimxdihhuijfzpkojdzkmngstojffvnoqaqmllphycofjbl"
        + "nfezpegiepznfnuycsziulsbqyxhxqaronctcahbaapvfmbokiixkqwaiykbbeucshdvegrqdjtfimcieeegqjse"
        + "cvfdgvdkjzliptflgumrjfldodtfqjpnpgvyfltbbgmncvhkiruncmpuaiyhucthfdjabmeqdeoaaooodpdwrtmi"
        + "xxwyeyjwnywrrncfvrdqflyscliwwnbzsztqwkcddmirkforoqsoyzfwwjuaolismetkualisnlvdmgffxmbqaoc"
        + "qwmdguwemtfyrqvdmbuccqqtynbadpapdkpogsomqfpdqqhfmgwcuvdlknnkhynkqajxrxlzdcabsiqvcykbvjhg"
        + "dwxvmjkubcntwlilxvvakyrnjiuucwsuxvhlmbsaxuotjoitkmngxpkpldtnhrxjqrfsgqtxoxykftsyvqowucby"
        + "hatdujsqlinptxoyfkgygqhwzpsgaycmmmmlsecjmtsjpnbsuxxaaxxkxayfzhpiscijaxfhfaxjwouerzcvevik"
        + "ejsefzkxfglrgovnsbtuwihccceorwkcfuggaysbklgbyqtxqognibxclpukgfbuzuhkzzemuprtgcoesycpwjkp"
        + "ayewbwdmctsjivxmmpaghurgoxbefvniinyaqbhszxrhfvztnjcdgjocwoliscvwzbvpouhcfsjoqnybzszumkqa"
        + "rplgcsrqvbqbjnyhaojfzglmqsfuaytaaadfxxsopihvmbnchrkccpnowozrugvzzcpqqbvhcrmlazflovnixyum"
        + "ozssjcnpezmkfvuovprsrfpzckzdyktlarvioyhztpakmdqhqndydasgcvhjvwqamqrqmuswieajrzqmyigpvtkv"
        + "hrbkwjdziarttbvhqwmgfnpuefsewkovrefecqtfqugicnxaghglhcpnxqfpjoskaigokiirpbtpdbzfrjzguojl"
        + "pqphqpmamvrpzpwagqivzttjdltyftaslevbfwxouwjurkrbmezfqdznivfgqrliinhrvtncogqkzwcxchhhjmqg"
        + "euqrjezwmtrfztzbozpigtkfrbzzrbssejmbnxzxzqisviokofkvhvtjdcvixuzlieindmmhfrxtokmouzpmtpgd"
        + "kffkoeelklkdjcnuyalyoxyyogjacsjfwlizsspeanicuwxtunplocqxmxfdofazbkaalqqhziuwjuzprhpqmfoq"
        + "tnxnjsprtxsqidivvbtdfjmbjsvnhetvqjaelzrhdjpgitpimwmuqpwzfnynptjuxjadotnkonyhxbeyxbkshxmh"
        + "mcjmjcnfwlhwcykrifanadtqctlhfegytcsxxmbivlygozrfrygaljniekeeuzmvbnjkwttevyywknwneuhxfwwr"
        + "ohchwcptpqkefougsirugnriazkwozhvaanjhyrpughqhorenqrgvmkksvqhjkripmkmjbsdtfsxqukivqdumyyn"
        + "ogfxlxvhzfxdyijlvglvwmksjfqntiazwzjiygnactcrarhdqqqrgnkaorfswojmjfefjzdzossmjqprllsvlnok"
        + "lknzukscsqvxbhqzlfbxowlvsqaflqexjfhlmlthouhsvfataineuujcbovldvoceljfpvgdyanxextucrcytyyj"
        + "wcefdcblbozbvmdbiuyvdphymgsdpncnfhfmifhgpvvvddexeabhejnikxrabrdnfxfdcyfrvqxpxmywgmmjuduw"
        + "utzemcmqbudnszaaarlqoahjbrrvdlwvxppcdzxrqmhznpcjkljxdyltcjlihcwxepiwfgdjvycoamcqkcmjqihl"
        + "milvcbnovrgfaqgbqcprrmhijyismbcgfkjzoawkupuillmikukfohfjrapsaecmfxvvcpsiosjbqpgtyztdxzvb"
        + "zadxlprtvzzhldvyiamqkrjnybxxgnnbcilyijqmfcgjbtmeobfaxsquqjddhqpjzuziqjsyyrluipjszmrzqreo"
        + "ppytxzzvnbgiooijyyquokjtcedrastformrhqarhsauobahllbwcwqqqwohauasevptmxopqebibashpmheilae"
        + "fqadjovcldbgdqtptragscaxnluujbjydfnqxjlvtdtflebmswhkmhylkyyaltijcuzgaclztrknfbqwpqujcpvn"
        + "uulxlpjcblaertebbtkbrhkxxgqbctcmfcdsxakipjpyuuhumuvzqudhiataoehozmpelgpdujsnxejafhquzqtp"
        + "znvkgibsnolvqozrnebtaatstjqjdiusynfwxbgfuqkzovhudbdywbazsdfizcyikeoxygadopyphttjkklxesli"
        + "xmrrigplsbrrlzpfvtxiecqyecqajszhzsgeykcmrmwfnbjjwqevwclxdbwfuaotbjavkfktyaclteynccofcsgm"
        + "qemkuwlsqwpjrbsgmjbddemafrevxdpkehbidbbugwsggqmbyeecpawsqsmdvxqocfziyamascxfmgzvmhqlnnjz"
        + "gzxbnsvhgxuxmhsclpknaattrbaobcgaoprgkeedpbddjhtxhiuphhtwvqdzabvttnhhrzfjlylcsqdqsjwjqsqfq"
        + "kbpbjgljuwuxoiqorksrrdpehjkqyqqiurhdnfeobkoclvpbmhnchcvovxbwsekmnvgmnywksuafvkbmbxnxkdpu"
        + "tgauavkjfhoyymmmbkghkpwgrtzndmmbtqvgtykimatlanrhgfapgwgodfpnkvwtuesdmditncttytrdqsfymuze"
        + "whiomeeytwpdjrqqdiqikkwaxpbuxludlsgdvwqeyhcrvncdpghkjycsjxvaoykqtlwexdokkvvckaaxgtqgluki"
        + "ctsorssexcibxiakuukoijzwpvltaetpzmxaxxzpnrxrutbnguslsyrrlzqfgrsrwbhpoxfvystlsatvzvhfbqhf"
        + "plrrdcnhrwwjcfgeqgofejrxcpkiczogdmetofgqrbvihewrilzerxakjfewkngxwkanjxdpdfhotsmtvyelegiw"
        + "kgseiqzeibkpxvaawefxylptniursxudupypyhvpyujfscgbzkmoyirlokrohdnqvzzvzjywyihsojciahptwneb"
        + "wlzvabnbhuqtvilnhjgqewewkxtxiguvpbirbbqkugrjdnjjseptmsdghnvbmxpofgwtgdywkobcngiadyuwuccg"
        + "dlgoscjvcryhhhpzchrhqwkeqgazszncxezxhbwttbzajnjgljdkhtwbdumzbvpfpgoszqkfeowoduxgypfgpcnh"
        + "uzbsuhqweqpzniuwujlwotewtplzapsyjcbjivbnutuyovbwyqvasfdwqiihlbgypvqvifdmmmbzfpqrsjkzmqkl"
        + "ieonctvsxcziyfiefnuqqhjxcdikwdoatdglhdderjkkmmctnykdndvqwhpxzbvyyikihrexwurhnnazdbxrgmjx"
        + "aeukaeumtzyojfpehkupbmwxzzxlkzbpfgyflngzuuacsqldglucyuecstwgopmkirbuogctmzqhselchlwkgymx"
        + "hhpkwcnazcmzrvbuagchgxlhcujkbwtcjxtvocmrdpjumaprmftriikbecuhftsdqjpamydefzadenxljfnchnns"
        + "hhvsvaihfnanxtxiumjudpeheutvayrnoaclomdebhqbmedjfxxomsadzvjrfuhmgmszpfcahtzbibwdeqdxanqp"
        + "kqzlqosoiljxkpzluhmogwkqhckccxwyqhxjslmpdcxcpnkixsqrqpyjrrmmlxrtkcqgsfwrajkfbrsomowhwzqa"
        + "dyulokduojcchszdojvkjscxdeljostagvelawosbgfzzzefnvlcgpmrhoiypyylduuknxqsjanuqeaguruhnvvw"
        + "jhrhdsdmgrzgmwwhcrndluycdolmdltoccypwviunqqrhkoclrrdpjglhntrkamdltinbmdqvfvrcmakxtcjykzm"
        + "tpbadvzywecjsdvcdhiveacfyszfekovgbxrdsjbkhbhyfgzncnzaizbflqnrtruuojaiboaktrecnfkdhiqrdci"
        + "gojwczqqzqquklzmehwxquovvxpxrcqjfnflptdjeiroekdlrwsiuesqjuuxkiyskriiseqcrrxtfiotsijvpmdm"
        + "upuhjzxityknwitlcklyffnjifcscbjfbdvieappjjfvwakughujjaimenqxyebofbzbqjndlustljadlkaptqay"
        + "dyrtdffrvcvpbmzsntohttmktpsaiykaqktobpinlreqmiorhbooaiuavurejqcklbludcbayhctrndyfzkwutfi"
        + "oszteecnqtjwzisxcxbqhfuhbrgikbepbcxfibbxllqwsmtdveaighrpgnrkbilzindsjklsvlhpbvdcsfehijka"
        + "yeemfublnshkwjxgmuklonzqegsdwtehxrfzlewlkiwtmihjmqppfsuaasfmwaybhuqilynllbftognjofdtbdex"
        + "yezptiknhiorqcgpuzusftfjqrntsuidnukdqnjrombvuexuzszwwprzrlrkmezrfibklwmdfzacverytndsfrkw"
        + "anqrimyhrxnghridxjvvbwmleylmtffmyfkddlfteacuahxdsvfuzjkreyzbuzazsdzrlpoavepgfwajvgdqitor"
        + "zpchfvldcirdyiwjpqdknqtbocwqtrldypmlpxgzccilamhnselmnijphwighutnjgyjtcueqkivjrhwzgbjgqyk"
        + "clslpicsdbyamvbujfinwuiuheocuuprqtqszxferkwpapqlaeopoqxyggutokmuhmdnuapbajcdqdacaudlqbpz"
        + "lnhlwikqdeuzojldccvovabqkeanwctmpptogudwglhodezelfsgsxjrqbbqxkdygcsgmhfvofxsufuprnhgsnhx"
        + "zlpxzlxhilsymmwkdyemsiquznxhubgykbzgetxudbnauohsxyatqqaydxrrenarpzwqvtsctvgcrbnijpvclesy"
        + "rqyfhxzqudaytyzdngvaqskylaqsspdfsbyxtpsuhtmkytlhcgppmmijggaervjitbtuiwmtkkcpilvuuypzbxwm"
        + "gpzfdakvaysrfxokhdhrfxgoybusiavkaqijtotgtguisrhqcecggwrznfnajmgyiadmbanuldddgtakcrzbyhwi"
        + "nqdetefdiflesxnmhujywxhdyowzqrmgeuyskcdbhjyxngjrguoslcweswcgbxexlbtukuuvenrvsokkxjqydqle"
        + "vrtpyvpyzqswgslopvmjckrhepptoafxcbsbymgwfstwqxxmuiceoayarlihhzlucykshjsgsysubxnwenittlkh"
        + "jktemikzvbvvelxjehmqznmmnogjampvbfgdvkdjcbacgeigseiqbojbjfhoulgdgsgxbhdomevbgoxrqhthpbqn"
        + "dvxnlbguepepmlhptbxiyllbvbdqcpnqhpssojyufniezblbkbukzzpcearejpjrfzzkxjajmuorutnuejimlgyb"
        + "agywkoiibswdzejdwmqrvznufcylrsbdcafeeldoqowdeeheekyhopgfcqcveiuoabwrghfnwzbdorsxdkmlzeei"
        + "kojefxcsisybsvgxkgooibuntrgshqifywdqsyjqzvrokoplfchlqegrlzwearppuurzmkejnyciyecovrsdsvpo"
        + "ytxveabxfruvpmbfivswsjtrhciiasusjbnwyvdvrguvyjogfvuluuvapnhqigxpnnrlwrbcmbvpmomzsqogpgjm"
        + "vlsuawkkooacxxrpzpthctmzepjfbwtribegcjcccyevwvorzhgvvsfvqjozwrotpjsnqfbyrsvuuvtgjojrqkwr"
        + "jmllpuseffwrpzypjdfcnhjtqdzrryjioaesnrykmfjopjmudndftcxfioqlocfocgkyabsqgskfxcvftfkznslb"
        + "ykijhpgekucvncctgtmcxocxgfyabiorqkdstdfervuqhqyviysrjqqdsoxfdlixtpxecpqewwewshaqrjjsczli"
        + "rzrbdmkxfczydrtmxbjvnfpamcqfsyeslljrvvxpolnandnxawxjgauzebugikvpseyibzhhjyajdkrvzztoyuej"
        + "skxeuoicmoovsnkwgfiaimppbqndbxrxecthkydpujfsjsffloryrxcpopyuudtlokknemyxcxlcspjfthtrgifq"
        + "acjm";
    String c = "abc";
    String d = "ababab";
    String e = "abababa";
    String f = "abcdabcd";
    String g = "ajlfdsjalsjdfla;djsfa;l";

    boolean aResult = repeatedSubstringPattern(a);
    boolean bResult = repeatedSubstringPattern(b);
    boolean cResult = repeatedSubstringPattern(c);
    boolean dResult = repeatedSubstringPattern(d);
    boolean eResult = repeatedSubstringPattern(e);
    boolean fResult = repeatedSubstringPattern(f);
    boolean gResult = repeatedSubstringPattern(g);

    System.out.println("a " + aResult);
    System.out.println("b " + bResult);
    System.out.println("c " + cResult);
    System.out.println("d " + dResult);
    System.out.println("e " + eResult);
    System.out.println("f " + fResult);
    System.out.println("g " + gResult);

  }
}
