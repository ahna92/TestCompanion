import SwiftUI
import shared

struct ContentView: View {
	init(){
		print("Shared object: \(Greeting.Companion.shared)")
		print("start as \(Greeting.Companion.shared.getCount())")
		Greeting.Companion.shared.addCount()
		Greeting.Companion.shared.onCallBack {
			print("Shared object: callback \(Greeting.Companion.shared)")
			print("Should be 1 and it is: \(Greeting.Companion.shared.getCount())")
		}
	}
	let greet = Greeting().greet()

	var body: some View {
		Text(greet)
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}