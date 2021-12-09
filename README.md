# plugin-info

### A plugin for the [ja-netfilter](https://github.com/ja-netfilter/ja-netfilter), it allows you to custom license info in ja-netfilter.

#### Use the `mvn clean package` command to compile and use `info-vX.X.X-jar-with-dependencies.jar` file!

#### Add some rules to the janf_config.txt

```
[INFO]
EQUAL,licenseeName,[your custom licnese name]
EQUAL,paidUpTo,[expired date]
```
For example
```
[INFO]
EQUAL,licenseeName,Neo
EQUAL,paidUpTo,2012-12-31
```
