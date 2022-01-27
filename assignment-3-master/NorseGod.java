package mr223_assign3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import java.util.ArrayList;

public class NorseGod extends Application {
    private String race;
    private String name;
    private String desc;

    public NorseGod(){

    }

    public NorseGod(String name, String race, String desc){
        this.name = name;
        this.desc = desc;
        this.race = race;
    }

    public String getName(){
        return name;
    }
    public String getRace(){
        return race;
    }
    public String getDesc(){
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static void main(String[] args){
        Application.launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        root.setMinSize(15,60);
        ListView<String> gods = new ListView<String>();
        gods.setPrefWidth(160);

        ArrayList<NorseGod> god = new ArrayList<>();


        god.add(new NorseGod("Odin","Æsir","Odin (/ˈoʊdɪn/;[1] from Old Norse: Óðinn, IPA: [ˈoːðinː]) is a widely revered god in Germanic mythology. Norse mythology, the source of most surviving information about him, associates Odin with wisdom, healing, death, royalty, the gallows, knowledge, war, battle, victory, sorcery, poetry, frenzy, and the runic alphabet, and portrays him as the husband of the goddess Frigg. In wider Germanic mythology and paganism, the god was known in Old English as Wōden, in Old Saxon as Wōdan, in Old Dutch as Wuodan[2]and in Old High German as Wuotan.\n"
        +"Old Norse texts portray Odin as one-eyed and long-bearded, frequently wielding a spear named Gungnir and wearing a cloak and a broad hat. He is often accompanied by his animal companions and familiars—the wolves Geri and Freki and the ravens Huginn and Muninn, who bring him information from all over Midgard—and rides the flying, eight-legged steed Sleipnir across the sky and into the underworld. Odin is the son of Bestla and Borr and has two brothers, Vili and Vé. Odin is attested as having many sons, most famously the gods Thor (with Jörð) and Baldr (with Frigg), and is known by hundreds of names. In these texts he frequently seeks greater knowledge, at times in disguise (most famously by obtaining the Mead of Poetry), makes wagers with his wife Frigg over the outcome of exploits, and takes part both in the creation of the world by way of slaying the primordial being Ymir and in giving the gift of life to the first two humans Ask and Embla. Odin has a particular association with Yule, and mankind's knowledge of both the runes and poetry is also attributed to him, giving Odin aspects of the culture hero."));






        god.add(new NorseGod("Thor", "Æsir","In Germanic mythology, Thor (/θɔːr/; from Old Norse: Þórr, runic ᚦᚢᚱ þur) is a hammer-wielding god associated with thunder, lightning, storms, sacred groves and trees, strength, the protection of mankind and also hallowing and fertility. Besides Old Norse Þórr, extensions of the god occur in Old English as Þunor and in Old High German as Donar (runic ᚦᛟᚾᚨᚱ þonar). All forms of the deity stem from a Common Germanic *Þunraz (meaning thunder).\n" +
                "\n" +
                "Thor is a prominently mentioned god throughout the recorded history of the Germanic peoples, from the Roman occupation of regions of Germania, to the tribal expansions of the Migration Period, to his high popularity during the Viking Age, when, in the face of the process of the Christianization of Scandinavia, emblems of his hammer, Mjölnir, were worn and Norse pagan personal names containing the name of the god bear witness to his popularity.\n"
        + "Due to the nature of the Germanic corpus, narratives featuring Thor are only attested in Old Norse, where Thor appears throughout Norse mythology. Norse mythology, largely recorded in Iceland from traditional material stemming from Scandinavia, provides numerous tales featuring the god. In these sources, Thor bears at least fifteen names, is the husband of the golden-haired goddess Sif, is the lover of the jötunn Járnsaxa, and is generally described as fierce eyed, red haired and red bearded.[1] With Sif, Thor fathered the goddess (and possible valkyrie) Þrúðr; with Járnsaxa, he fathered Magni; with a mother whose name is not recorded, he fathered Móði, and he is the stepfather of the god Ullr. By way of Odin, Thor has numerous brothers, including Baldr. Thor has two servants, Þjálfi and Röskva, rides in a cart or chariot pulled by two goats, Tanngrisnir and Tanngnjóstr (that he eats and resurrects), and is ascribed three dwellings (Bilskirnir, Þrúðheimr, and Þrúðvangr). Thor wields the mountain-crushing hammer, Mjölnir, wears the belt Megingjörð and the iron gloves Járngreipr, and owns the staff Gríðarvölr. Thor's exploits, including his relentless slaughter of his foes and fierce battles with the monstrous serpent Jörmungandr—and their foretold mutual deaths during the events of Ragnarök—are recorded throughout sources for Norse mythology.\n"
        +"The earliest records of the Germanic peoples were recorded by the Romans, and in these works Thor is frequently referred to – via a process known as interpretatio romana (where characteristics perceived to be similar by Romans result in identification of a non-Roman god as a Roman deity) – as either the Roman god Jupiter (also known as Jove) or the Greco-Roman god Hercules. The first clear example of this occurs in the Roman historian Tacitus's late first-century work Germania, where, writing about the religion of the Suebi (a confederation of Germanic peoples), he comments that \"among the gods Mercury is the one they principally worship. They regard it as a religious duty to offer to him, on fixed days, human as well as other sacrificial victims. Hercules and Mars they appease by animal offerings of the permitted kind\" and adds that a portion of the Suebi also venerate \"Isis\".[6] In this instance, Tacitus refers to the god Odin as \"Mercury\", Thor as \"Hercules\", and the god Týr as \"Mars\", and the identity of the Isis of the Suebi has been debated. In Thor's case, the identification with the god Hercules is likely at least in part due to similarities between Thor's hammer and Hercules' club.[7] In his Annals, Tacitus again refers to the veneration of \"Hercules\" by the Germanic peoples; he records a wood beyond the river Weser (in what is now northwestern Germany) as dedicated to him.[8]\n" +
                "\n" +
                "In Germanic areas occupied by the Roman Empire, coins and votive objects dating from the 2nd and 3rd century AD have been found with Latin inscriptions referring to \"Hercules\", and so in reality, with varying levels of likelihood, refer to Thor by way of interpretatio romana.[9]"));






        god.add(new NorseGod("Loki", "Giant","Loki's relation with the gods varies by source; Loki sometimes assists the gods and sometimes behaves in a malicious manner towards them. Loki is a shape shifter and in separate incidents he appears in the form of a salmon, a mare, a fly, and possibly an elderly woman named Þökk (Old Norse 'thanks'). Loki's positive relations with the gods end with his role in engineering the death of the god Baldr and Loki is eventually bound by Váli with the entrails of one of his sons. In both the Poetic Edda and the Prose Edda, the goddess Skaði is responsible for placing a serpent above him while he is bound. The serpent drips venom from above him that Sigyn collects into a bowl; however, she must empty the bowl when it is full, and the venom that drips in the meantime causes Loki to writhe in pain, thereby causing earthquakes. With the onset of Ragnarök, Loki is foretold to slip free from his bonds and to fight against the gods among the forces of the jötnar, at which time he will encounter the god Heimdallr and the two will slay each other."));





        god.add(new NorseGod("Baldr", "Ásynjur","Baldr (also Balder, Baldur) is a god in Norse mythology and a son of the god Odin and the goddess Frigg. He has numerous brothers, such as Thor and Váli.\n" +
                "\n" +
                "During the 12th century, Danish accounts by Saxo Grammaticus and other Danish Latin chroniclers recorded a euhemerized account of his story. Compiled in Iceland during the 13th century, but based on much older Old Norse poetry, the Poetic Edda and the Prose Edda contain numerous references to the death of Baldr as both a great tragedy to the Æsir and a harbinger of Ragnarök.\n" +
                "\n" +
                "According to Gylfaginning, a book of Snorri Sturluson's Prose Edda, Baldr's wife is Nanna and their son is Forseti. Baldr had the greatest ship ever built, Hringhorni, and there is no place more beautiful than his hall, Breidablik.\n"
        +"Baldr is known primarily for the story of his death, which is seen as the first in a chain of events that will ultimately lead to the destruction of the gods at Ragnarök. According to Völuspá, Baldr will be reborn in the new world.\n" +
                "\n" +
                "He had a dream of his own death and his mother had the same dreams. Since dreams were usually prophetic, this depressed him, so his mother Frigg made every object on earth vow never to hurt Baldr. All objects made this vow except mistletoe[9]—a detail which has traditionally been explained with the idea that it was too unimportant and nonthreatening to bother asking it to make the vow, but which Merrill Kaplan has instead argued echoes the fact that young people were not eligible to swear legal oaths, which could make them a threat later in life"));






        god.add(new NorseGod("Freyja", "Vanir", "n Norse mythology, Freyja (/ˈfreɪə/; Old Norse for \"(the) Lady\") is a goddess associated with love, beauty, fertility, gold, and seiðr. Freyja is the owner of the necklace Brísingamen, rides a chariot pulled by two cats, is accompanied by the boar Hildisvíni, and possesses a cloak of falcon feathers. By her husband Óðr, she is the mother of two daughters, Hnoss and Gersemi. Along with her brother Freyr, her father Njörðr, and her mother (Njörðr's sister, unnamed in sources), she is a member of the Vanir. Stemming from Old Norse Freyja, modern forms of the name include Freya, Freyia, and Freja.\n"+
                "Freyja rules over her heavenly field, Fólkvangr, where she receives half of those who die in battle. The other half go to the god Odin's hall, Valhalla. Within Fólkvangr lies her hall, Sessrúmnir. Freyja assists other deities by allowing them to use her feathered cloak, is invoked in matters of fertility and love, and is frequently sought after by powerful jötnar who wish to make her their wife. Freyja's husband, the god Óðr, is frequently absent. She cries tears of red gold for him, and searches for him under assumed names. Freyja has numerous names, including Gefn, Hörn, Mardöll, Sýr, Valfreyja, and Vanadís.\n"+
                "In the poem Lokasenna, where Loki accuses nearly every female in attendance of promiscuity or unfaithfulness, an aggressive exchange occurs between Loki and Freyja. The introduction to the poem notes that among other gods and goddesses, Freyja attends a celebration held by Ægir. In verse, after Loki has flyted with the goddess Frigg, Freyja interjects, telling Loki that he is insane for dredging up his terrible deeds, and that Frigg knows the fate of everyone, though she does not tell it. Loki tells her to be silent, and says that he knows all about her—that Freyja is not lacking in blame, for each of the gods and elves in the hall have been her lover. Freyja objects. She says that Loki is lying, that he is just looking to blather about misdeeds, and since the gods and goddesses are furious at him, he can expect to go home defeated. Loki tells Freyja to be silent, calls her a malicious witch, and conjures a scenario where Freyja was once astride her brother when all of the gods, laughing, surprised the two. Njörðr interjects—he says that a woman having a lover other than her husband is harmless, and he points out that Loki has borne children, and calls Loki a pervert. The poem continues in turn."));









        god.add(new NorseGod("Freyr", " Vanir","Freyr (Old Norse: Lord), sometimes anglicized as Frey, is a widely attested god in Norse mythology, associated with sacral kingship, battle, virility, peace and prosperity, with sunshine and fair weather, and with good harvest. Freyr, sometimes referred to as Yngvi-Freyr, was especially associated with Sweden and seen as an ancestor of the Swedish royal house. According to Adam of Bremen, Freyr was associated with peace and pleasure, and was represented with a phallic statue in the Temple at Uppsala. According to Snorri Sturluson, Freyr was \"the most renowned of the æsir\", and was venerated for good harvest and peace.\n"+
                "In the mythological stories in the Icelandic books the Poetic Edda and the Prose Edda, Freyr is presented as one of the Vanir, the son of the sea god Njörðr, or Njord, as well as the twin brother of the goddess Freyja. The gods gave him Álfheimr, the realm of the Elves, as a teething present. He rides the shining dwarf-made boar Gullinbursti and possesses the ship Skíðblaðnir which always has a favorable breeze and can be folded together and carried in a pouch when it is not being used. Freyr is also known to have been associated with the horse cult. He also kept sacred horses in his sanctuary at Throndheim in Norway.[1] He has the servants Skírnir, Byggvir and Beyla.\n" +
                "\n" +
                "The most extensive surviving Freyr myth relates Freyr's falling in love with the female jötunn Gerðr. Eventually, she becomes his wife but first Freyr has to give away his sword which fights on its own \"if wise be he who wields it.\" Although deprived of this weapon, Freyr defeats the jötunn Beli with an antler. However, lacking his sword, Freyr will be killed by the fire jötunn Surtr during the events of Ragnarök.\n" +
                "\n" +
                "Like other Germanic deities, veneration of Freyr is revived during the modern period through the Heathenry movement."));





        god.add(new NorseGod("Heimdallr", "Æsir","In Norse mythology, Heimdallr is a god who possesses the resounding horn Gjallarhorn, owns the golden-maned horse Gulltoppr, is called the shining god and the whitest of the gods, has gold teeth, and is the son of Nine Mothers (who may represent personified waves). Heimdallr is attested as possessing foreknowledge, keen eyesight and hearing, and keeps watch for invaders and the onset of Ragnarök while drinking fine mead in his dwelling Himinbjörg, located where the burning rainbow bridge Bifröst meets the sky. Heimdallr is said to be the originator of social classes among humanity and once regained Freyja's treasured possession Brísingamen while doing battle in the shape of a seal with Loki. Heimdallr and Loki are foretold to kill one another during the events of Ragnarök. Heimdallr is additionally referred to as Rig, Hallinskiði, Gullintanni, and Vindlér or Vindhlér.\n"+
                "Heimdallr is attested in the Poetic Edda, compiled in the 13th century from earlier traditional material; in the Prose Edda and Heimskringla, both written in the 13th century by Snorri Sturluson; in the poetry of skalds; and on an Old Norse runic inscription found in England. Two lines of an otherwise lost poem about the god, Heimdalargaldr, survive. Due to the problematic and enigmatic nature of these attestations, scholars have produced various theories about the nature of the god, including his apparent relation to rams, that he may be a personification of or connected to the world tree Yggdrasil, and potential Indo-European cognates."+
                "In the Prose Edda, Heimdallr is mentioned in the books Gylfaginning, Skáldskaparmál, and Háttatal. In Gylfaginning, the enthroned figure of High tells the disguised mythical king Gangleri of various gods, and, in chapter 25, mentions Heimdallr. High says that Heimdallr is known as \"the white As\", is \"great and holy\", and that nine maidens, all sisters, gave birth to him. Heimdallr is called Hallinskiði and Gullintanni, and he has gold teeth. High continues that Heimdallr lives in \"a place\" called Himinbjörg and that it is near Bifröst. Heimdallr is the watchman of the gods, and he sits on the edge of heaven to guard the Bifröst bridge from the berg jötnar. Heimdallr requires less sleep than a bird, can see at night just as well as if it were day, and for over a hundred leagues. Heimdallr's hearing is also quite keen; he can hear grass as it grows on the earth, wool as it grows on sheep, and anything louder. Heimdallr possesses a trumpet, Gjallarhorn, that, when blown, can be heard in all worlds, and \"the head is referred to as Heimdall's sword\". High then quotes the above-mentioned Grímnismál stanza about Himinbjörg and provides two lines from the otherwise lost poem about Heimdallr, Heimdalargaldr, in which Heimdallr proclaims himself to be the son of Nine Mothers.[24]\n" +
                "\n" +
                "In chapter 49, High tells of the god Baldr's funeral procession. Various deities are mentioned as having attended, including Heimdallr, who there rode his horse Gulltopr."));



        god.add(new NorseGod("Bragi", "Æsir", "Bragi is generally associated with bragr, the Norse word for poetry. The name of the god may have been derived from bragr, or the term bragr may have been formed to describe 'what Bragi does'. A connection between the name Bragi and Old English brego 'chieftain' has been suggested but is generally now discounted. A connection between Bragi and the bragarfull 'promise cup' is sometimes suggested, as bragafull, an alternate form of the word, might be translated as 'Bragi's cup'.\n"
        +"That Bragi is Odin's son is clearly mentioned only here and in some versions of a list of the sons of Odin (see Sons of Odin). But \"wish-son\" in stanza 16 of the Lokasenna could mean \"Odin's son\" and is translated by Hollander as Odin's kin. Bragi's mother is possibly the giantess Gunnlod. If Bragi's mother is Frigg, then Frigg is somewhat dismissive of Bragi in the Lokasenna in stanza 27 when Frigg complains that if she had a son in Ægir's hall as brave as Baldr then Loki would have to fight for his life.\n" +
                "\n" +
                "In that poem Bragi at first forbids Loki to enter the hall but is overruled by Odin. Loki then gives a greeting to all gods and goddesses who are in the hall save to Bragi. Bragi generously offers his sword, horse, and an arm ring as peace gift but Loki only responds by accusing Bragi of cowardice, of being the most afraid to fight of any of the Æsir and Elves within the hall. Bragi responds that if they were outside the hall, he would have Loki's head, but Loki only repeats the accusation. When Bragi's wife Iðunn attempts to calm Bragi, Loki accuses her of embracing her brother's slayer, a reference to matters that have not survived. It may be that Bragi had slain Iðunn's brother.\n" +
                "\n" +
                "A passage in the Poetic Edda poem Sigrdrífumál describes runes being graven on the sun, on the ear of one of the sun-horses and on the hoofs of the other, on Sleipnir's teeth, on bear's paw, on eagle's beak, on wolf's claw, and on several other things including on Bragi's tongue. Then the runes are shaved off and the shavings are mixed with mead and sent abroad so that Æsir have some, Elves have some, Vanir have some, and Men have some, these being speech runes and birth runes, ale runes, and magic runes. The meaning of this is obscure.\n" +
                "\n" +
                "The first part of Snorri Sturluson's Skáldskaparmál is a dialogue between Ægir and Bragi about the nature of poetry, particularly skaldic poetry. Bragi tells the origin of the mead of poetry from the blood of Kvasir and how Odin obtained this mead. He then goes on to discuss various poetic metaphors known as kennings.\n" +
                "\n" +
                "Snorri Sturluson clearly distinguishes the god Bragi from the mortal skald Bragi Boddason, whom he often mentions separately. The appearance of Bragi in the Lokasenna indicates that if these two Bragis were originally the same, they have become separated for that author also, or that chronology has become very muddled and Bragi Boddason has been relocated to mythological time. Compare the appearance of the Welsh Taliesin in the second branch of the Mabinogi. Legendary chronology sometimes does become muddled. Whether Bragi the god originally arose as a deified version of Bragi Boddason was much debated in the 19th century, especially by the scholars Eugen Mogk and Sophus Bugge.[1] The debate remains undecided.\n" +
                "\n" +
                "In the poem Eiríksmál Odin, in Valhalla, hears the coming of the dead Norwegian king Eric Bloodaxe and his host, and bids the heroes Sigmund and Sinfjötli rise to greet him. Bragi is then mentioned, questioning how Odin knows that it is Eric and why Odin has let such a king die. In the poem Hákonarmál, Hákon the Good is taken to Valhalla by the valkyrie Göndul and Odin sends Hermóðr and Bragi to greet him. In these poems Bragi could be either a god or a dead hero in Valhalla. Attempting to decide is further confused because Hermóðr also seems to be sometimes the name of a god and sometimes the name of a hero. That Bragi was also the first to speak to Loki in the Lokasenna as Loki attempted to enter the hall might be a parallel. It might have been useful and customary that a man of great eloquence and versed in poetry should greet those entering a hall. He is also depicted in tenth-century court poetry of helping to prepare Valhalla for new arrivals and welcoming the kings who have been slain in battle to the hall of Odin.[2]"));




        god.add(new NorseGod("Tyr","Æsir","Týr (Old Norse), Tíw (Old English), and Ziu (Old High German) is a god in Germanic mythology. Stemming from the Proto-Germanic deity *Tīwaz and ultimately from the Proto-Indo-European chief deity *Dyeus, little information about the god survives beyond Old Norse sources. Due to the etymology of the god's name and the shadowy presence of the god in the extant Germanic corpus, some scholars propose that Týr may have once held a more central place among the deities of early Germanic mythology.\n"
        +"Týr is the namesake of the Tiwaz rune (ᛏ), a letter of the runic alphabet corresponding to the Latin letter T. By way of the process of interpretatio germanica, the deity is the namesake of Tuesday ('Týr's day') in Germanic languages, including English. Interpretatio romana, in which Romans interpreted other gods as forms of their own, generally renders the god as Mars, the ancient Roman war god, and it is through that lens that most Latin references to the god occur. For example, the god may be referenced as Mars Thingsus (Latin 'Mars of the Thing') on 3rd century Latin inscription, reflecting a strong association with the Germanic thing, a legislative body among the ancient Germanic peoples.\n" +
                "\n" +
                "In Norse mythology, from which most surviving narratives about gods among the Germanic peoples stem, Týr sacrifices his arm to the monstrous wolf Fenrir, who bites off his limb while the gods bind the animal. Týr is foretold to be consumed by the similarly monstrous dog Garmr during the events of Ragnarök. In Old Norse sources, Týr is alternately described as the son of the jötunn Hymir (in Hymiskviða) or of the god Odin (in Skáldskaparmál). Lokasenna makes reference to an unnamed otherwise unknown consort, perhaps also reflected in the continental Germanic record (see Zisa (goddess)).\n" +
                "\n" +
                "Various place names in Scandinavia refer to the god, and a variety of objects found in England and Scandinavia may depict the god or invoke him."));

        for (NorseGod e: god){
            gods.getItems().add(e.getName());
        }

        Text head = new Text("Norse Gods and Other Beings");
        head.setFont(Font.font("Arial", FontWeight.EXTRA_BOLD,30));


        Text godname = new Text();
        godname.setFont(Font.font("Calibri", FontWeight.BOLD,25));
        Text godDesc = new Text();
        godDesc.setFont(Font.font("Calibri", 22));
        Text godtyp = new Text();
        godtyp.setFont(Font.font("Calibri",FontWeight.BOLD, 22));

        TextFlow textFlow = new TextFlow(godname,godtyp,godDesc);
        textFlow.setPadding(new Insets(10, 10, 10, 10));
        textFlow.setLineSpacing(5);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(textFlow);
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);

        gods.getSelectionModel().selectedIndexProperty().addListener(ov -> {
            godname.setText(god.get(gods.getSelectionModel().getSelectedIndex()).getName()+"\n");
            godtyp.setText(god.get(gods.getSelectionModel().getSelectedIndex()).getRace()+"\n");
            godDesc.setText(god.get(gods.getSelectionModel().getSelectedIndex()).getDesc());
        });

        root.setLeft(gods);
        root.setTop(head);
        root.setLeft(gods);
        root.setCenter(scrollPane);

        primaryStage.setTitle("Norse Gods");
        primaryStage.setScene(new Scene(root,800,600));
        primaryStage.show();
    }
}