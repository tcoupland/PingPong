# pingpong

I'm not very much, just a few functopms that wrap clj-redis's pub/sub functions.

## Usage

 * Download and start Redis
 * In one terminal start a subscriber
   
     lein run sub chan

   This will hang waiting for messages to print.
 * In a second terminal publish some messages
     
     lein run pub chan hello

You should see you messages appear in the first term.

## License

Copyright © 2012 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
