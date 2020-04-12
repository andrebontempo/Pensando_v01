package com.bontempo.pensando_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView caixaTexto01;
    private TextView caixaTexto02;
    private TextView caixaTexto03;
    private ScrollView rolagem;

    private Button botaoTexto;

    private String frases[][] = {
                                {"Aprender a Ver" , "Aprender a ver - habituar os olhos à calma, à paciência, ao deixar-que-as-coisas-se-aproximem-de-nós;\n" +
                                        "aprender a adiar o juízo, a rodear e a abarcar o caso particular a partir de todos os lados. Este é o primeiro ensino preliminar para o espírito:\n" +
                                        " não reagir imediatamente a um estímulo, mas sim controlar os instintos que põem obstáculos, que isolam. Aprender a ver, tal como eu o entendo, \n" +
                                        "é já quase o que o modo afilosófico de falar denomina vontade forte: o essencial nisto é, precisamente, o poder não «querer», o poder diferir a decisão.\n"+
                                        " Toda a não-espiritualidade, toda a vulgaridade descansa na incapacidade de opor resistência a um estímulo — tem que se reagir, seguem-se todos os impulsos. Em muitos casos esse ter que é já doença, decadência, sintoma de esgotamento, — quase tudo o que a rudeza afilosófica designa com o nome de «vício» é apenas essa incapacidade fisiológica de não reagir. — Uma aplicação prática do ter-aprendido-a-ver: enquanto discente em geral, chegar-se-á a ser lento, desconfiado, teimoso. Ao estranho, ao novo de qualquer espécie deixar-se-o-á aproximar-se com uma tranquilidade hostil, — afasta-se dele a mão. O ter abertas todas as portas, o servil abrir a boca perante todo o facto pequeno, o estar sempre disposto a meter-se, a lançar-se de um salto para dentro de outros homens e outras coisas, em suma, a famosa «objectividade» moderna é mau gosto, é algo não-aristocrático par excellence. " , "Crepúsculo dos Ídolos"},
                                {"A Fragilidade dos Valores" , "Todas as coisas «boas» foram noutro tempo más; todo o pecado original veio a ser virtude original. O casamento, por exemplo, era tido como um atentado contra a sociedade e pagava-se uma multa, por ter tido a imprudência de se apropriar de uma mulher (ainda hoje no Cambodja o sacerdote, guarda dos velhos costumes, conserva o jus primae noctis). Os sentimentos doces, benévolos, conciliadores, compassivos, mais tarde vieram a ser os «valores por excelência»; por muito tempo se atraiu o desprezo e se envergonhava cada qual da brandura, como agora da dureza.\n" +
                                        "A submissão ao direito: oh! que revolução de consciência em todas as raças aristocráticas quando tiveram de renunciar à vingança para se submeterem ao direito! O «direito» foi por muito tempo um vetitum, uma inovação, um crime; foi instituído com violência e opróbio.\n" +
                                        "Cada passo que o homem deu sobre a Terra custou-lhe muitos suplícios intelectuais e corporais; tudo passou adiante e atrasou todo o movimento, em troca teve inumeráveis mártires; por estranho que isto hoje nos pareça, já o demonstrei na Aurora, aforismo 18: «Nada custou mais caro do que esta migalha de razão e de liberdade, que hoje nos envaidece». Esta mesma vaidade nos impede de considerar os períodos imensos da «moralização dos costumes» que precederam a história capital e foram a verdadeira história, a história capital e decisiva que fixou o carácter da humanidade. Então a dor passava por virtude, a vingança por virtude, a renúncia da razão por virtude, e o bem-estar passivo por perigo, o desejo de saber por perigo, a paz por perigo, a misericórdia por opróbio, o trabalho por vergonha, a demência por coisa divina, a conversão por imoralidade e a corrupção por coisa excelente. " , "A Genealogia da Moral"},
                                {"O Que se Pode Prometer" , "Pode-se prometer acções, mas não sentimentos, pois estes são involuntários. Quem promete a alguém amá-lo sempre, ou odiá-lo sempre, ou ser-lhe sempre fiel, promete algo que não está em seu poder; mas o que pode perfeitamente prometer são aquelas acções que, na verdade, são geralmente as consequências do amor, do ódio, da fidelidade, mas que também podem emanar de outras razões, pois a uma acção conduzem diversos caminhos e motivos. A promessa de amar sempre alguém significa, portanto: enquanto eu te amar, manifestar-te-ei as acções do amor; se eu já não te amar, pois, não obstante, receberás para sempre de mim as mesmas acções, ainda que por outros motivos. De modo que a aparência de que o amor estaria inalterado e continuaria sendo o mesmo permanece na cabeça das outras pessoas. Promete-se, por conseguinte, a persistência da aparência do amor, quando, sem ilusão, se promete a alguém amor perpétuo. " , "Humano, Demasiado Humano"},
                                {"A Vida não me Desapontou" , "Não, a vida não me desapontou! Pelo contrário, todos os anos a acho melhor, mais desejável, mais misteriosa... desde o dia em que vejo a mim a grande libertadora, a ideia de que a vida podia ser experiência para aqueles que procuram saber, e não dever, fatalidade, duplicidade!... Quanto ao próprio conhecimento, seja ele para outros aquilo que quiser, um leito de repouso, ou o caminho para um leito de repouso, ou distracção ou vagabundagem, para mim é um mundo de perigos, é um universo de vitórias onde os sentimentos heróicos têm a sua sala de baile. «A vida é um meio de conhecimento»; quando se tem este princípio no coração, pode viver-se não somente corajoso mas feliz, pode-se rir alegremente! E quem, de resto, se ouvirá, portanto, a bem rir e a bem viver se não for primeiramente capaz de vencer e de guerrear?" , "A Gaia Ciência"},
                                {"Cada um Tem o Seu Conceito de Felicidade" , "Muita gente só é capaz de uma felicidade reduzida: o facto de a sua sensatez não poder proporcionar-lhes mais felicidade não constitui um argumento contra ela, não mais do que se deve ver um argumento contra a medicina no facto de serem algumas pessoas incuráveis e outras sempre doentias. Que cada um possa ter a hipótese de encontrar justamente a concepção da vida que lhe permita realizar o seu máximo de felicidade: isso não impede necessariamente que a sua vida permaneça lastimável e pouco invejável. " , "Aurora"},
                                {"A Genética Condiciona a Felicidade","Uma era de felicidade simplesmente não é possível porque as pessoas querem apenas desejá-la, mas não possuí-la, e cada indivíduo aprende durante os seus bons tempos a de facto rezar por inquietações e desconforto. O destino do homem está projetado para momentos felizes — toda a vida os têm —, mas não para eras felizes. Estas, porém, permanecerão fixadas na imaginação humana como \"o que está além das montanhas\", como um legado de nossos ancestrais: pois o conceito de uma era de felicidade foi sem dúvida adquirido nos tempos primordiais, a partir da condição em que, depois de um esforço violento na caça e na guerra, o homem se entrega ao repouso, estica os membros e sente as asas do sono roçando a sua pele. Será uma falsa conclusão se, na trilha dessa remota e familiar experiência, o homem imaginar que, após eras inteiras de labor e inquietação, ele poderá usufruir, de modo correspondente, daquela condição de felicidade intensa e prolongada.","Humano, Demasiado Humano"},
                                {"O Caminho da Felicidade","Um sábio perguntava a um louco qual era o caminho da felicidade. O louco respondeu-lhe imediatamente, como alguém a quem se pergunta o caminho da cidade vizinha: «Admira-te a ti mesmo e vive na rua». «Alto lá», exclamou o sábio, «pedes demais, basta já que nos admiremos!» E o louco respondeu logo: «Mas como admirar sem cessar se não nos desprezarmos constantemente?» ","A Gaia Ciência"},
                                {"Os Fortes Aspiram a Separar-se e os Fracos a Unir-se","O crescimento da comunidade frutifica no indivíduo um interesse novo que o aparta da sua pena pessoal, da sua aversão à sua própria pessoa. Todos os doentes aspiram instintivamente a organizar-se em rebanhos, o sacerdote ascético adivinha este instinto e alenta-os onde quer que haja rebanhos, o instinto de fraqueza forma-os, a habilidade do sacerdote organiza-os. Não nos enganemos: os fortes aspiram a separar-se e os fracos a unir-se; se os primeiros se reúnem, é para uma acção agressiva comum, que repugna muito à consciência de cada qual; pelo contrário, os últimos unem-se pelo prazer que acham em unir-se; porque isto satisfaz o seu instinto, assim como irrita o instinto dos fortes. Toda a oligarquia envolve o desejo da tirania; treme continuamente por causa do esforço que cada um dos indivíduos tem que fazer para dominar este desejo. ","Genealogia da Moral"},
                                {"O Amor ao Próximo","Vós outros andais muito solícitos em redor do próximo, e a vossa solicitude exprime-se em belas palavras. Mas eu vos digo: o vosso amor ao próximo é apenas o vosso mau amor por vós próprios.\n" +
                                        "É para fugirdes de vós que andais em volta do próximo, e quereríeis converter isso numa virtude; mas pus a claro o vosso «desinteresse».\n" +
                                        "(...) Não suportais a vossa própria companhia, e não vos amais o suficiente; procurais então seduzir o próximo com o vosso amor e doirar-vos com o seu erro.\n" +
                                        "Eu quisera que todos os próximos e aqueles que se seguem se vos tornassem intoleráveis: assim teríeis de extrair de vós mesmos o amigo de coração transbordante.\n" +
                                        "Convocais uma testemunha quando quereis dizer bem de vós; e logo que a haveis induzido a pensar bem da vossa pessoa, vós mesmos pensais bem da vossa pessoa.\n" +
                                        "É mentiroso não só o que fala contra a sua consciência, mas também o que fala contra a sua inconsciência. Ora é assim que falais de vós no trânsito diário, e que enganais o próximo e a vós mesmos.\n" +
                                        "Assim fala o louco: 'O convívio dos homens estraga o carácter, sobretudo quando não tem carácter'.\n" +
                                        "Um procura o próximo porque se procura, o outro porque anseia perder-se. O vosso mau amor por vós próprios converte a vossa solidão num cativeiro. ","Assim Falava Zaratustra"},
                                {"Não Seremos Capazes de Modificar um Único Homem","Deixemos pois de pensar mais em punir, em censurar e em querer melhorar! Não seremos capazes de modificar um único homem; e se alguma vez o conseguíssemos seria talvez, para nosso espanto, para nos darmos também conta de outra coisa: é que teríamos sido nós próprios modificados por ele! Procuremos antes, por isso, que a nossa influência se contraponha e ultrapasse a sua em tudo o que está para vir! Não lutemos em combate directo... qualquer punição, qualquer censura, qualquer tentativa de melhoria representa combate directo. Elevemo-nos, pelo contrário, a nós próprios muito mais alto. Façamos sempre brilhar de forma grandiosa o nosso exemplo. Obscureçamos o nosso vizinho com o fulgor da nossa luz. Recusemo-nos a nos tornar, a nós próprios, mais sombrios por amor dele, como todos os castigadores e todos os descontentes! Escutemo-nos, antes, a nós. Olhemos para outro lado. ","A Gaia Ciência"},
                                {"Escolhe Inimigos Que Te Mereçam","Gosto dos valentes; mas não basta bater a torto e a direito; é preciso saber ainda no que se bate. E muitas vezes há mais coragem em se conter e passar adiante, a fim de se reservar para um adversário mais digno. Tende apenas inimigos dignos de ódio, e não inimigos desprezíveis; é necessário que possais estar orgulhosos dos vossos inimigos; já vos ensinei isso.\n" +
                                        "É necessário reservardes-vos para um adversário mais digno, meus amigos; por isso tereis de passar por cima de muitas ofensas, - passar por cima de muita canalha que vos massacrará com as palavras povo e nação.\n" +
                                        "Livrai o vosso olhar de se misturar às suas contestações. É um matagal de direitos e de abusos. Ter de considerá-los irrita. Lançar aí os olhos - atirar-se para a confusão - é a mesma coisa; ide-vos pois para os bosques e deixai dormir a vossa espada!\n" +
                                        "Segui os caminhos que vos pertencem. E deixai povos e nações seguirem os seus escuros caminhos, na verdade, nos quais não brilha uma única esperança! ","Assim Falava Zaratustra"},
                                {"A Necessidade do Próximo","Nós só sentimos agrado para com os semelhantes - ou seja pelas imagens de nós próprios - quando sentimos comprazimento connosco. E quanto mais estamos contentes connosco, mais detestamos o que nos é estranho: a aversão pelo que nos é estranho está na proporção da estima que temos por nós. É em consequência dessa aversão que nós destruímos tudo o que é estranho, ao qual assim mostramos o nosso distanciamento.\n" +
                                        "Mas o menosprezo por nós próprios pode levar-nos a uma compaixão geral para com a humanidade e pode ser utilizado, intencionalmente, para uma aproximação com os demais.\n" +
                                        "Temos necessidade do próximo para nos esquecermos de nós mesmos: o que leva à sociabilidade com muita gente.\n" +
                                        "Somos dados a supor que também os outros têm desgosto com o que são; quando isto se verifica, então receberemos uma grande alegria: afinal, estamos na mesma situação.\n" +
                                        "E, talqualmente nos vemos forçados a suportar-nos, apesar do desgosto que temos com aquilo que somos, assim nos habituamos a suportar os nossos semelhantes.\n" +
                                        "Assim, nós deixamos de desprezar os outros; a aversão para com eles diminui, e dá-se a reaproximação.\n" +
                                        "Eis porque, em virtude da doutrina do pecado e da condenação universal, o homem se aproxima de si mesmo. E até aqueles que detêm efectivamente o poder são de considerar, agora como dantes, sob este mesmo aspecto: é que, «no fundo, são uns pobres homens». ","A Vontade de Poder"},
                                };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto01 = findViewById(R.id.caixaTexto01Id);
        caixaTexto02 = findViewById(R.id.caixaTexto02Id);
        caixaTexto03 = findViewById(R.id.caixaTexto03Id);
        rolagem = findViewById(R.id.scrollViewId);

        botaoTexto = findViewById(R.id.botaoTextoId);

        //caixaTexto02.setText(frases[5]);

        botaoTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rolagem.scrollTo(0,0);

                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(frases.length);

                caixaTexto01.setText(frases[numeroAleatorio][0]);
                caixaTexto02.setText(frases[numeroAleatorio][1]);
                caixaTexto03.setText("Fonte: " + frases[numeroAleatorio][2]);
            }
        });


    }
}
