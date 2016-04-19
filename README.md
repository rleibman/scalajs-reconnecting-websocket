# scalajs-reconnecting-websocket

Utilities for interacting with websockets in scalajs 

Usage:

Super simple, just instantiate in your app an instance of the ReconnectingWebsocket:

```scala
	val ws = new ReconnectingWebsocket(s"wss://${window.location.host}/processStatusUpdate",
	debug = true,
  	onMessage = { event ⇒
		val msg = read[ProcessUpdateMessage](event.data.toString)
      	println(s"Websocket: We got a message! ${msg}")
      	refresh.runNow()
  })
```
