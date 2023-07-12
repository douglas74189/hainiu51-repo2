package com.dzz.IO;


import com.sun.xml.internal.ws.api.message.SuppressAutomaticWSARequestHeadersFeature;
import jdk.nashorn.internal.ir.debug.PrintVisitor;

import javax.naming.Name;
import javax.swing.*;
import java.net.SocketTimeoutException;
import java.rmi.MarshalledObject;
import java.util.*;

class Test {
    public static void main(String[] args) {
        /*Student s1 = new Student("Tom", 20, 90);
        Student s2 = new Student("Jerry", 22, 95);
        Student s3 = new Student("John", 20, 100);
        Student s4 = new Student("Lily", 22, 100);
        Student s5 = new Student("bucy", 22, 90);
        Student s6 = new Student("aevin", 22, 90);

        HashSet<Student> hs1=new HashSet<Student>();
        hs1.add(s1);
        hs1.add(s2);
        hs1.add(s3);
        hs1.add(s4);
        hs1.add(s5);
        hs1.add(s6);
   *//*     for (Object o : hs1) {
            System.out.println(o);
        }*//*
        Collection ts1=new TreeSet(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int temp = -(o1.getScore() - o2.getScore());
                temp = temp == 0 ? -(o1.getAge() - o2.getAge()) : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
                return temp;
            }
        });
        ts1.addAll(hs1) ;
//        ts1.forEach(o -> System.out.println(o));*/


      /*  HashMap hm1 = new HashMap();
        hm1.put(1930, "乌拉圭");
        hm1.put(1934, "意大利");
        hm1.put(1938,"意大利");
        hm1.put(1950,"乌拉圭");
        hm1.put(1954,"西德");
        hm1.put(1958,"巴西");
        hm1.put(1962,"巴西");
        hm1.put(1966,"苏格兰");
        hm1.put(1970,"巴西");
        hm1.put(1974,"西德");
        hm1.put(1978,"阿根廷");
        hm1.put(1982,"意大利");
        hm1.put(1986,"阿根廷");
        hm1.put(1990,"西德");
        hm1.put(1994,"巴西");
        hm1.put(1998,"法国");
        hm1.put(2002,"巴西");
        hm1.put(2006,"意大利");
        hm1.put(2010,"西班牙");
        hm1.put(2014,"德国");
        hm1.put(2018,"法国");
        hm1.put(2022,"阿根廷");
        Set  s1= hm1.entrySet();*/
//        System.out.println(s1);
        /*for (Object o : s1) {
            System.out.println(o);
        }
        */
//        searchSoccerGame(hm1);

        String str1 = "文本涉及两个主体，即文本生产者和文本消费者： 文本生产者: 生成文本的主体；传递生产者想表达的内容，可能也会潜在蕴含着生产者的一些特质属性文本消费者: 阅读文本的主体；消费者阅读这段文本时，文本又对消费者认知活动产生影响在大数据的今天，通过互联网超文本链接，无数的个人、团体、公司、政府等不同组织形态的主体均深深嵌入到互联网世界，在网络世界中留下了大量的文本。社会、管理、经济、营销、金融等不同学科，均可以研究网络上海量的文本，扩宽的研究对象和研究领域。下面大部分内容是从政治学和经管领域的两份文档翻译来，我觉得讲的挺明白的，其中加入了我的一些理解和扩充。\n" +
                "text as text 原始的文本，定性的文本\n" +
                "textual data(text as data) 量化后的文本数据，可定量\n" +
                "2.1 text as text\n" +
                "text as text 原始的文本，定性的文本\n" +
                "文本的重点是传递着某种东西，从某种意义上说，所有形式的文本都包含可以被视为数据形式的信息。因此，文本总是以某种方式提供信息（即使我们不了解如何操作）。但是，言语活动的主要目标不是记录信息，而是进行交流：传达思想，指令，查询等。我们可以记录下来并将其视为数据，但是将我们的想法或思想表达为单词和句子的目的主要是交流，而不是将我们的想法或思想记录为数据形式。大多数数据是这样的：它表征的活动与数据本身完全不同。\n" +
                "例如，在经济学中，可能是我们想要刻画的经济交易（使用价值媒介交换商品或服务），而数据是以某种聚合形式对这些交易进行抽象，这有助于我们理解交易的意义。通过就抽象的相关特征达成共识，我们可以记录并分析人类活动，例如制造业，服务业或农业。从通信行为中提取文本数据特征的过程遵循相同的过程，但有一个主要区别：由于原始文本可以直接通过记录的语言与我们交谈，因此文本首先不需要进行处理或抽象化待分析。但是，我在这里的论点是，特征抽象的过程是将文本视为数据而不是直接将其视为文本的方法的独特之处。\n" +
                "具有讽刺意味的是，只有当我们破坏了直接理解文本的能力时，才有可能利用文本的数据获取洞察力。 为了使它作为数据有用，我们必须消除原始文本的结构，将文本转换为结构化的表格数据。定量分析是理解非语言数据的起点； 另一方面，非结构的文本变成丑陋表格数据的过程，出于统计分析或机器学习目的，我们经常质疑这一过程丢失了什么信息。\n" +
                "机器是愚蠢的，但是将文本视为数据意味着让愚蠢的机器处理并可能分析我们的文本。关键是，为了将文本作为数据 而不是文本仅仅是文本，我们必须破坏原始文本的直接可解释性，但目的是从其样式化特征中进行更系统，更大规模的推断。 我们应该坚定不移地认识到这一过程，但也不要因此而寝食不安，因为将文本作为数据进行分析的重点永远不是解释数据而是挖掘其深层次的模式。 数据挖掘是一个破坏性的过程-随便问问哪个矿山-为了开采其宝贵资源，开采矿产资源不可避免会破坏地表形态和环境。\n" +
                "2.2 Latent versus manifest characteristics from textual data\n" +
                "textual data(text as data) 量化后的文本数据，可定量的数据。所以小标题我翻译为“量化后的文本数据隐藏的信息vs直观可见的信息”，\n" +
                "在政治学领域，我们通常最感兴趣的不是文本本身，而是文本透漏给我们有关作者的一些隐藏特性。 在政治（以及心理学）研究中，我们有关政治和社会行为者的一些重要理论，很多时候直接观察行为活动很难观察到其内在的品质。\n" +
                "例如，意识形态是研究政治竞争和政治偏好的基础，但是我们没有直接的衡量工具来记录个人或政党有关“社会和道德自由政策与保守政策”的相对偏好。 其他偏好，包括支持或反对特定政策，如1846年废除了英国的《玉米法》（Schonhardt-Bailey，2003年）； 在关于《莱肯公约》的辩论中支持或反对进一步的欧洲一体化（Benoit等，2005）；再比如支持或反对不信任运动（Laver和Benoit，2002年）。\n" +
                "这些偏好是作为政治行为者的内部状态而存在的，无论这些行为者是立法者，政党，代表还是候选人，都无法直接观察。非言语行为指标也可用于推断这些信息，但事实表明，政治行为者所说的话比其他行为形式更为真诚。\n" +
                "因此，文本数据（Textual data）可能包含有关取向和信念的重要信息，对于这些取向和信念，非语言形式的行为可能会充当不良指标。长期以来，心理学领域也一直将言语行为作为可观察到的潜在兴趣状态的暗示，例如人格特质（例如Tausczik和Pennebaker，2010年）。缺少增强的询问技术或头脑阅读技术来识别政治和社会行为者的偏好，信念，意图，偏见或个性，下一个最佳选择是根据其说话或书写的内容来收集和分析数据。关注的对象不是文本包含的内容，而是其内容作为有关潜在特征的数据所揭示的内容，这些潜在特征为其提供了可观察的含义。最后一句话比较难理解，可以理解为万事万物有联系，通过联系思维来挖掘文本中的信息。\n" +
                "文本数据(Textual data)还可能具有较为明显的特征，例如，政治传播的许多领域都与文本所指出的潜在特征无关，而与文本本身所包含的传播形式和性质有关。举一个经典的例子，在一个著名的政治局委员对斯大林诞辰70周年之际的文章的研究中，莱特斯，伯努特和加索夫（1951）能够衡量各团体在共产主义意识形态方面的差异。在这一政治事件中，这些信息不仅预示了潜在的方向，而且还预示了在可预见的斯大林死后事件中有关领导权斗争的某种政治动作。这些信息本身是重要的，这些信息只能从每个政治局委员撰写的公开文章中搜集而来，它们必须充分了解将在党和苏联苏维埃新闻，并由其他政权参与者解释为信号。再举一个例子，如果我们对一个政治演说家是使用民粹主义还是种族主义语言感兴趣，那么该语言将直接以民粹主义或种族主义术语或参考形式出现在文本中，而要紧的是它们是否被使用。与其说这些术语代表什么，不如说是什么。例如Jagers和Walgrave（2007）在研究比利时政党的政党政治广播时，发现极右翼政党Vlaams Blok所使用的民粹词语远比其他比利时政党丰富的多。\n" +
                "在实践中，从文本可观察到的明显特征与潜在特征之间的特征的有时候这两个概念区分的并不明显。举例来说，文体风格可以用一些明显的特征词对文本进行量化，体现出作者的一些写作偏好。例如，在使用适用于政治文本的可读性度量改编的研究中，我们可能会对政治成熟度的潜在水平感兴趣，这可以用来衡量说话者的意图或说话者的特征，这一点从观察到的文本样本中可以看出。或者，我们可能会对它们在可读性上的明显差异感兴趣，这是传播媒介更直接指标。例如，在对英国议会历史演讲的研究中，Spirling（2016）将19世纪末期向简单语言的转变归因于广播扩展特许经营的民主化效应。 Benoit，Munger和Spirling（2019）使用类似的措施，比较了同一位总统当天在同一天发表的美国总统国情咨文演讲的样本，但其口头和书面形式均表明口头形式使用的语言较为简单。前一项研究可能对语言的易用性感兴趣，该语言的易用性是政治代表制更潜在的特征的指标，而后一项分析可能更侧重于交付媒介的明显后果。对于许多使用文本数据的研究设计而言，区别更多是研究目标的问题，而不是结构化和分析文本数据的某些内在方式。";
        sunCharNum(str1);


    }

    private static void sunCharNum(String str1) {
        HashMap hm1 = new HashMap();
        char c1;
        char[] charArray1 = str1.toCharArray();

        for (char c : charArray1)/* {
            if (!hm1.containsKey(c)) {
                hm1.put(c, 1);

            } else {
                hm1.put(c, (int)(hm1.get(c) )+ 1);
            }
        }*/
        {
            if (hm1.containsKey(c)){
                hm1.put(c,(int) hm1.get(c)+1);

            }
            else {
                hm1.put(c,1)    ;
            }
        }
        Set hmKetSet=hm1.keySet();
        for (Object o : hmKetSet) {
            System.out.println(o+"="+hm1.get(o)+"   ");
        }
    }

    private static void searchSoccerGame(HashMap hm1) {
        Set set1 = hm1.keySet();
//        System.out.println(set1);

        Collection value1 = hm1.values();
//        System.out.println(value1);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入您想要查询的年份");
        Integer input1 = Integer.valueOf(sc1.nextLine());
        if (set1.contains(input1)) {
            System.out.println("这一年举办了世界杯，夺冠国家是：");
            System.out.println(hm1.get(input1));

        } else {
            System.out.println("这一年没有举办世界杯");
        }
        System.out.println("请输入您想要查找的国家");
        String str1 = sc1.nextLine();
        if (value1.contains(str1)) {
            System.out.println("这个国家夺冠的年份是：");
            List list = searchValue(hm1, str1);
            for (Object o : list) {
                System.out.println(o);
            }

        } else {
            System.out.println("您查找的国家尚未夺冠");

        }
    }

    public static List searchValue(HashMap m1, String c1) {
        Set<Integer> m2 = m1.keySet();
        List l1 = new ArrayList();

        for (Integer o : m2) {
            if (m1.get(o).equals(c1)) {
                l1.add(o);

            }
        }
        return l1;


    }

    class Student {

        private String name;

        private int score;
        private int age;

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            if (this == o) return true;
            Student student = (Student) o;
            return age == student.age &&
                    score == student.score &&
                    Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, score);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", score=" + score +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public Student(String name, int age, int score) {
            this.name = name;
            this.age = age;
            this.score = score;
        }

/*
    @Override
    public int compareTo(Student o) {
        int temp = -(this.score - o.score);
        temp = temp == 0 ? -(this.age - o.age) : temp;
        temp = temp == 0 ? this.name.compareTo(o.name) : temp;

        return temp;

*/

    }

}



