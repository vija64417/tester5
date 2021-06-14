
class FirstGroovy {
	static void main(args) {
		def urlContents="http://ablepharusk.myspecies.info/".toURL().getText()
		urlContents.eachLine {
			println it
		}
	}
}
