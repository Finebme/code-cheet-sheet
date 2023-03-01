javac @{sourceFilesList}  the '@' symbol tells the javac all the files needed complied is in the {sourceFilesList} file

"Cannot find main method" -> wrong package name,lack of classpath files


path01 = ClassLoader.getSystemClassLoader().getResource("temp/a.txt").getPath();
path02 = AController.class.getClassLoader().getResource("temp/a.txt").getPath();

path02 is safer,path01 would be null after pacakge

Collections.min(someList,Comparator.comparing(Entity::func))

不定项参数要放在方法参数的最后一个

@PostConstruct 用来修饰一个非静态的void方法，它会在服务器加载Servlet的时候运行，而且只运行一次
