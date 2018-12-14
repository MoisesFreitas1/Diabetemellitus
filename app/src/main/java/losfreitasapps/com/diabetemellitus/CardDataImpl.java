package losfreitasapps.com.diabetemellitus;

import com.ramotion.expandingcollection.ECCardData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CardDataImpl implements ECCardData<String> {

    private String cardTitle;
    private Integer mainBackgroundResource;
    private Integer headBackgroundResource;
    private List<String> listItems;

    public CardDataImpl(String cardTitle, Integer mainBackgroundResource, Integer headBackgroundResource, List<String> listItems) {
        this.mainBackgroundResource = mainBackgroundResource;
        this.headBackgroundResource = headBackgroundResource;
        this.listItems = listItems;
        this.cardTitle = cardTitle;
    }

    @Override
    public Integer getMainBackgroundResource() {
        return mainBackgroundResource;
    }

    @Override
    public Integer getHeadBackgroundResource() {
        return headBackgroundResource;
    }

    @Override
    public List<String> getListItems() {
        return listItems;
    }

    public String getCardTitle() {
        return cardTitle;
    }

    public static List<ECCardData> generateExampleData() {
        List<ECCardData> list = new ArrayList<>();
        list.add(new CardDataImpl("O panorama do diabetes mellitus como condição crônica: aspectos conceituais e epidemiológicos", R.drawable.diabetes, R.drawable.card1, createItemsList("Card 1")));
        list.add(new CardDataImpl("Formação do enfermeiro na atenção a pessoa com diabetes mellitus no contexto da Estratégia Saúde da Família", R.drawable.enfermagem, R.drawable.card2, createItemsList("Card 2")));
        list.add(new CardDataImpl("O diabetes mellitus e a saúde óssea: contribuições para a formação do enfermeiro", R.drawable.osso, R.drawable.card3, createItemsList("Card 3")));
        list.add(new CardDataImpl("REFERÊNCIAS", R.drawable.livros, R.drawable.card4, createItemsList("Card 4")));
        return list;
    }

    private static List<String> createItemsList(String cardName) {
        ArrayList<String> list = new ArrayList<>();
        if (cardName == "Card 1"){
            list.addAll(Arrays.asList("O diabetes mellitus (DM) é uma doença metabólica crônica com alta morbidade e mortalidade que vem se tornando um problema de saúde pública. Em 1985, a prevalência mundial de DM era de aproximadamente 30 milhões de casos, aumentando para 177 milhões em 2000. Com base nas tendências atuais, mais de 360 milhões de pessoas terão a doença no ano de 2030 (SILVA; SKARE, 2012). \n" +
                    "As duas formas mais conhecidas do DM classificam-se em: diabetes mellitus tipo 1 (DM1) ou juvenil e diabetes mellitus tipo 2 (DM2) ou fase adulta. O DM1, o qual denominado de insulinodependente, acontece de forma rápida e progressiva atingindo crianças e adolescentes (10 a 14 anos), mas pode ocorrer em qualquer idade; manifesta-se pela destruição da célula beta que eventualmente leva ao estágio de deficiência total de insulina, sendo necessária sua administração para prevenir cetoacidose, coma e morte. Já o DM2 surge na maturidade, idade acima de 30 anos e caracteriza-se por defeitos na ação e na secreção da insulina, caso seja administrada insulina não é para prevenir a cetoacidose, mas para corrigir um quadro hiperglicêmico (INTERNATIONAL DIABETES FEDERATION – IDF, 2015).\n" +
                    "O diabetes é um grupo de doenças metabólicas caracterizadas por hiperglicemia e associadas a complicações, disfunções e insuficiência de vários órgãos, especialmente olhos, rins, nervos, cérebro, coração e vasos sanguíneos. Pode resultar de defeitos de secreção e/ou ação da insulina envolvendo processos patogênicos específicos (IDF, 2015).\n" +
                    "Por meio de sua definição pode-se compreender que o diabetes é resultante do aumento da hiperglicemia além das complicações de diferentes órgãos que são responsáveis para o desenvolvimento do organismo, o que remete o entendimento de que, os cuidados em relação à prevenção são essenciais para o funcionamento correto e satisfatório do corpo. \n" +
                    "O DM1, é caracterizado pela destruição das células beta, ocasionando a deficiência de produção de insulina, sendo comum em 10% dos casos diagnosticados (FLUMIGNAN, 2006). Ressalta-se que, o seu desenvolvimento é apresentado de maneira progressivo, principalmente em crianças e adolescentes, ressaltando que em adultos, apresentando-se de maneira mais lenta (FLUMIGNAN, 2006). \n" +
                    "A respeito do DM2, vale salientar que não é adquirido de maneira congênita, sendo uma condição crônica resultante de maus hábitos adquiridos e realizados durante o desenvolvimento da vida. Os principais fatores relacionados ao surgimento do diabetes mellitus tipo 2 estão relacionados à falta de atividade física, obesidade e falta de cuidados com a própria alimentação (IDF, 2015)."));
        } else if (cardName == "Card 2"){
            list.addAll(Arrays.asList("A compreensão da atual situação do ensino em enfermagem deveria implicar primeiro a revisão e observação da evolução histórica da enfermagem, para posterior reflexão sobre sua influência nos “formadores de formadores” da nossa profissão, pois as escolas conservam atitudes e posturas que refletem a prática de seus primórdios. Devemos relembrar quem foram os primeiros formadores, que objetivos tinham, pois todo acontecimento tem uma razão histórica (BRASIL; ALENCAR; MUCCI, 1996). \n" +
                    "Apesar de alguns avanços, a formação dos profissionais de saúde ainda está muito distante do cuidado integral. O perfil dos profissionais de saúde demonstra qualificação insuficiente para as mudanças das práticas. Uma necessidade crescente de educação permanente para esses profissionais, com o objetivo de (re)significar seus perfis de atuação, para implantação e fortalecimento da atenção à saúde no SUS é um grande desafio (BATISTA; GONÇALVES, 2011). \n" +
                    "O enfermeiro tem formação direcionada basicamente para o conhecimento relacionado à sua prática assistencial, com pouca ênfase para outras possíveis atividades, como a docente, fazendo que, por vezes, esse profissional não esteja conscientizado das outras funções que lhe são atribuídas pela sociedade, com o título que lhe outorga (BRASIL; ALENCAR; MUCCI, 1996). \n" +
                    "É necessário e indispensável que as várias instâncias, articulem caminhos para a formação de novos profissionais de saúde, possibilitem o desenvolvimento/atualização do pessoal que já está no SUS e legitimem propostas direcionadas a um desempenho profissional qualificado e em quantidade suficiente em todos os pontos do País (BATISTA; GONÇALVES, 2011). \n" +
                    "Outro aspecto importante que cumpre observar é que a realidade da academia, na qual são elaborados e transmitidos os conteúdos para os futuros profissionais, nem sempre condiz com os campos de trabalho oferecidos pelo mercado, reforçando um antigo problema dos enfermeiros relativo, muitas vezes, à dicotomia entre a teoria e a prática. As escolas buscam formar um profissional, por ela concebido como ideal, com um corpo de conhecimentos científicos, de habilidades técnicas e atitudes desvinculadas, muitas vezes, das situações que ele encontrará nos locais de trabalho (BRASIL; ALENCAR; MUCCI, 1996). \n" +
                    "Os docentes de enfermagem têm diante da sociedade a responsabilidade de formar profissionais críticos, analíticos e com competência para prestar uma assistência de enfermagem de qualidade. O professor deve saber conduzir as experiências dos estudantes também no corpo clínico, favorecendo o desenvolvimento da reflexão de sua ação. Todavia, como não teve preparo para tanto, e a literatura, por ser escassa, lhe oferece pouca ajuda, acaba por se basear na vivência pessoa ou na experiência de seus colegas, tornando-se autodidata (BRASIL; ALENCAR; MUCCI, 1996)."));
        } else if(cardName == "Card 3"){
            list.addAll(Arrays.asList("O DM vem se configurando como uma doença grave que afeta o indivíduo por ocasionar várias outras doenças. No Brasil atualmente o Diabetes Mellitus (DM) está entre as principais doenças crônicas que leva ao um alto índice de morbidade e mortalidade e investimento governamental, para ações junto ao tratamento e suas complicações. Dentre as patologias crônicas é a quarta causa de morte no Brasil (ROCHA et al., 2015). \n" +
                    "A insulina é um hormônio anabólico produzido pelas células β do pâncreas, cuja síntese é ativada pela elevação da glicemia. A insulina é o principal hormônio anabólico do organismo. Seus efeitos mais conhecidos estão associados ao metabolismo energético, especialmente a regulação do metabolismo de glicose, ácidos graxos, aminoácidos, estimula a proliferação de osteoblastos e promove a síntese de colágeno. Além disso, esse hormônio age no osso através de receptores de insulina expressos pelos osteoblastos (IRS-1 e IRS-2) (DESSORDI, 2015). \n" +
                    "A taxa de mortalidade causada pelo DM chega a cerca de 50 mil pessoas por ano, sendo que em 2010, 54 mil brasileiros morreram em consequência do diabetes. Essa patologia afeta mais de 200 milhões de pessoas no mundo atual, e estima-se que em 2025 o número de diabéticos seja de 380 milhões. A doença apresenta altos índices de novos casos e mortalidade, além de ter significante custo social e financeiro para a sociedade e os sistemas de saúde (BRASIL, 2013). \n" +
                    "O DM, por sua vez, influencia negativamente as células tronco mesenquimais devido à hiperglicemia que compromete a função e a diferenciação das células ósseas, resultando em baixo turnover e formação óssea. Este quadro afeta a diferenciação de células tronco mesenquimais em células osteoblásticas, porém estimula a sua disponibilidade para a formação de adipócitos. Esse processo gera uma contínua deposição de células de gordura dentro da medula óssea, o que aumenta a cavidade medular, deixando o osso frágil e com microcirculação diminuída. Portanto, a função limitada dos osteoblastos e a atividade exacerbada dos osteoclastos, são fatores que influenciam negativamente a regulação da formação óssea, podendo evoluir para um quadro de osteoporose (DESSORDI, 2015). \n" +
                    "Há evidência convincente de que idosos com DM2 têm um risco elevado para todas as fraturas clínicas, particularmente em populações de afroamericanas e latinas. A este respeito, uma metanálise demonstrou um risco relativo (RR) de fratura de 1,2 (IC de 95% 1,0 a 1,5) em pacientes com DM2. Uma duração prolongada da diabetes parece aumentar o risco de fratura; no entanto, DM2 recém-diagnosticada está associada a um risco significativamente aumentado de qualquer fratura (coeficiente de risco, IC: 95%: 1,36, 1,32-1,40), bem como para fraturas de quadril, coluna, punho/mão, antebraço e braço/ ombro. Além disso, o controle da diabetes também influencia a fragilidade óssea, como mostrou uma recente metanálise indicando que o controle glicêmico inadequado contribui para o aumento do risco de fratura. No entanto, a redução agressiva da A1C não parece ser eficaz na prevenção de fraturas (MOREIRA; BARRETO; DEMPSTER, 2015). \n" +
                    "Segundo dados da literatura, observou-se que pacientes com DM tipo 1, apresentam redução acentuada no pico de massa óssea, mesmo após o início precoce do diagnóstico e tratamento da doença, sugerindo os efeitos anabólicos que a insulina exerce no osso. A formação óssea prejudica, tem sido proposta como um importante fator que contribui com o pico de massa óssea em pacientes diabéticos tipo 1. Em contraste, pacientes diabéticos tipo 2, podem apresentar densidade mineral óssea em valores normais ou aumentada, devido ao quadro de hiperinsulinemia, porém esses pacientes têm como principal característica a resistência à insulina, sugerindo que a hiperinsulinemia pode encontrar baixa sensibilidade em células ósseas e mesmo com densidade mineral óssea dentro dos parâmetros de normalidade há aumento na fragilidade óssea. Com base nessas informações, sugere-se que as diferenças que o DM tipo 1 e o DM tipo 2 exercem no esqueleto, não podem ser totalmente explicadas pela hipótese da insulinopenia. Portanto, o risco de fraturas no DM tipo 1 aumenta devido a diminuição da densidade mineral óssea, sendo que o prejuízo na formação óssea é resultado da deficiência absoluta de insulina e IGF-1, que leva a baixos picos de massa óssea (BIPRADAS, 2013; HAMANN et al., 2012; JACKULIAK; PAYER, 2014; WENDO; XIN, 2013; DESSORDI, 2015). \n" +
                    "No DM1 a deficiência de insulina e IGF-1 (fator de crescimento semelhante à insulina), levam a formação óssea prejudicada, microarquitetura óssea anormal, aumento na fragilidade óssea e reduzido pico de massa. A osteopenia é uma complicação causada pelo DM, podendo resultar no aumento do índice de fraturas, prejuízo da saúde óssea e consequentemente deterioração da qualidade de vida. Esta doença favorece o processo de osteopenia/osteoporose, pois afeta o equilíbrio entre a formação e a reabsorção óssea, favorecendo o funcionamento das células osteoclásticas que são responsáveis pela reabsorção óssea. Esta comorbidade afeta os tipos de DM, reduzindo a qualidade do osso e aumentando o risco de fraturas (DESSORDI, 2015). \n" +
                    "A hiperglicemia afeta o esqueleto em ambos os níveis da matriz óssea celular e extracelular. Estudos in vitro têm demonstrado que elevados níveis de glicose aumentam a diferenciação/fusão de osteoclastos, resultando em um ambiente de maior reabsorção. A nível tecidual, a hiperglicemia afeta a matriz óssea orgânica através do acúmulo de produtos finais de glicação avançada (AGEs) que levam à menor resistência óssea. Com efeito, a contribuição dos AGEs para o desenvolvimento e progressão das complicações da diabetes está bem demonstrada na literatura (MOREIRA; BARRETO; DEMPSTER, 2015) \n" +
                    "Os estudos conduzem a hipótese que os pacientes diabéticos sofrem prejuízo da qualidade óssea e para ambos os tipos de diabetes, a hiperglicemia é a principal característica da doença, o que acarreta os efeitos adversos no metabolismo ósseo de pacientes com glicemia mal controlada, levando ao aumento do estresse oxidativo (DESSORDI, 2015). \n" +
                    "O cuidado de enfermagem à pessoa com DM deve estar voltado à prevenção de complicações, avaliação e monitoramento dos fatores de risco, orientação quanto à prática de autocuidado. Sendo de competência de o enfermeiro realizar a consulta de enfermagem, solicitar exames e realizar transcrição de medicamentos de rotina de acordo com protocolos ou normas técnicas estabelecidas pelo gestor municipal, desenvolver estratégias de educação em saúde e fazer encaminhamentos quando necessário (OLIVEIRA; OLIVEIRA, 2010). \n" +
                    "Compete ao enfermeiro identificar precocemente os fatores de riscos, vulnerabilidade do indivíduo e o ambiente em que ele está inserido, através disto o profissional pode intervir de forma sistematizada para minimizar os riscos e os agravos a saúde. A intervenção de enfermagem consiste na educação em saúde, com incentivo para mudanças no estilo de vida, nos hábitos alimentares e proporcionando ao indivíduo o conhecimento sobre sua patologia (OLIVEIRA; OLIVEIRA, 2010). \n" +
                    "O conhecimento sobre a relação entre saúde óssea e o diabetes mellitus é de grande importância na formação do enfermeiro, visto que a assistência de enfermagem se apresenta fundamental para a pessoa com essa condição. Cabe a esse profissional orientar, acompanhar e promover ações voltadas para a educação em saúde para que a pessoa aprenda a conviver e lidar com a condição. \n" +
                    "O enfermeiro deve utilizar da educação em saúde como uma estratégia para a manutenção da saúde. A educação em saúde tem como um de seus objetivos, sensibilizar e motivar as mudanças necessárias nas atitudes da pessoa com diabetes mellitus, a fim de incorporar e de promover ações de cuidado. Assim, os profissionais de saúde devem envolver a pessoa no processo educacional para que os mesmos assumam a responsabilidade na terapêutica, dominando conhecimentos e desenvolvendo habilidades que instrumentalizem o autocuidado. Neste contexto, destaca-se a atuação do enfermeiro, pois, dentre suas diversas competências, está o desenvolvimento de ações educativas para a promoção de saúde, individual ou em grupo (MONTEIRO, 2015).   \n" +
                    "O conhecimento que cada um tem sobre a sua patologia é de grande validade, pois vivem com a mesma e necessitam de orientações técnico - cientifico vinda da equipe de enfermagem, e para que isso aconteça o profissional tem que manter uma relação interpessoal de forma que o cliente mantenha uma confiança facilitando assim o aprendizado de como viver com a patologia (ROCHA et al., 2015). \n" +
                    "A educação em saúde é a principal ferramenta utilizada pela equipe multidisciplinar, para orientar, educar e prevenir agravos na saúde da comunidade, levando conhecimento e esclarecimento à população estimulando a desenvolver uma postura pró-ativa em relação a seu autocuidado (ROCHA et al., 2015)."));
        }else if(cardName == "Card 4"){
            list.addAll(Arrays.asList("BATISTA, Karina Barros Calife; GONÇALVES, Otília Simões Janeiro. Formação dos Profissionais de Saúde para o SUS: significado e cuidado. Saúde Soc., São Paulo, v. 20, n. 4, p. 884-899, 2011\n" +
                    "\n" +
                    "BRASIL, Virginia Visconde; ALENCAR, Celi Cristiane Pereira de; MUCCI, Ivone Mucci. Refletindo sobre a formação e desempenho do docente de enfermagem. Cogitare Enferm., Curitiba, v. 1 n. 2, p. 81-85 - jul./dez. 1996. \n" +
                    "\n" +
                    "BRASIL, Ministério da Saúde. Brasil produzirá insulina humana a partir de 2016. Brasília: Ministério da Saúde; 2013.  \n" +
                    "\n" +
                    "DESSORDI, Renata. Efeito da Suplementação com Boro no Metabolismo Ósseo de Camundongos Diabéticos Não Obesos. 2015. \n" +
                    "\n" +
                    "FLUMIGNAN, I.H. Diabetes Mellitus e os fatores de risco ambientais. Dissertação. Universidade Federal do Rio de Janeiro – UFRJ, Rio de Janeiro, 2006.\n" +
                    "\n" +
                    "INTERNATIONAL DIABETES FEDERATION (IDF) [Internet]. Diabetes Atlas. 7. ed. Brussels: IDF; 2015 [cited 2016 Apr 8]. Avaliable from: https://www.idf.org/sites/default/files/EN_6E_Atlas_Full_0.pdf.\n" +
                    "JANGHORBANI M, VAN DAM RM, WILLETT WC, HU FB. Systematic review of type 1 and type 2 diabetes mellitus and risk of fracture. Am J Epidemiol, v. 166, n. 5, p. 495-505, 2007. \n" +
                    "\n" +
                    "MONTEIRO, Lidiane Aparecida. A contribuição do “Ensino do cuidado com os pés” na redução do risco de integridade da pele prejudicada dos pés e na qualidade de vida de pessoas com diabetes mellitus tipo 2 / Lidiane Aparecida Monteiro. -- https://bdtd.unifal-mg.edu.br:8443/handle/tede/584 Alfenas/MG, 120 f. 2015.\n" +
                    "\n" +
                    "MOREIRA, Carolina A.; BARRETO, Fellype C.; DEMPSTER, David W. Novos conceitos em diabetes e metabolismo ósseo. CEP, v. 80440, p. 020. 2015.\n" +
                    "\n" +
                    "OLIVEIRA, G.K.S.; OLIVEIRA, E.R. Assistência de enfermagem ao portador de diabetes mellitus: um enfoque na atenção primária em saúde. VEREDAS FAVIP - Revista Eletrônica de Ciências. v. 3, n. 2 - julho a dezembro de 2010. Disponível em:<http://veredas.favip.edu.br/index.php/veredas1/article/viewPDFInterstitial/144/14 5> Acesso em 15 de set. de 2016 \n" +
                    "\n" +
                    "ROCHA, Rogério G.; SIMIÃO, EKS.; SOBRAL, RA; FERREIRA, TN; BORGES, SLC; SILVA, PLN; OLIVEIRA , LMM; SOUZA, DFF. COMPLICAÇÃO DO DIABETES MELLITUS: uma revisão de literatura. Revista da Universidade Vale do Rio Verde, Três Corações, v. 13, n. 2, p. 92-104, 2015. \n" +
                    "\n" +
                    "SILVA, Marilia Barreto Gameiro; SKARE, Thelma Larocca. Musculoskeletaldisorders in diabetes mellitus. Revista Brasileira de Reumatologia, v. 52, n. 4, p. 601-609, 2012. \n"));}
        return list;
    }

}