javac @{sourceFilesList}  the '@' symbol tells the javac all the files needed complied is in the {sourceFilesList} file

"Cannot find main method" -> wrong package name,lack of classpath files


path01 = ClassLoader.getSystemClassLoader().getResource("temp/a.txt").getPath();
path02 = AController.class.getClassLoader().getResource("temp/a.txt").getPath();

path02 is safer,path01 would be null after pacakge
