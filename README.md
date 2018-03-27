# tomcat playground

Using servlet 4.0, Java 8, Tomcat 9.0.6.

## IntelliJ Ultimate
```bash
brew cask install java9
brew install tomcat
```

1. File > Open... and choose this directory.
2. Run > Edit Configurations...
  a. + > Tomcat Server > Local
  b. Name: Tomcat 9.0.6
  c. Application server > Configure...
    1. At the top left, click +.
    3. Tomcat Home: `/usr/local/Cellar/tomcat/9.0.6/libexec`
    4. OK.
  d. On 'Update' action: Restart server
  e. On frame deactivation: Update classes and resources
  f. JRE: `/Library/Java/JavaVirtualMachines/jdk-9.0.4.jdk/Contents/Home`
  g. OK.
3. File > Project Structure...
  a. Under Web Resource Directories, change the red line ending in `webapp` to `path/to/tomcat-pg/web`.
  b. OK.
4. Select Tomcat 9.0.6 for the Build Configuration
5. View > Tool Windows > Maven Projects
  a. Generate Sources and Update Folders for All Projects
6. Click the green arrow.
