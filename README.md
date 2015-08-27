Keys
====

A simple tool for generating random API and secret key pairs.

Getting Started
---------------

1.  Get and build the code

        $ git clone git@github.com:bentonporter/keys.git
        $ cd keys
        $ mvn clean install

2.  Run it

        $ ./generate

This will print out a randomly generated pair of keys:

    {
      "apiKey": "i8MksrUzkpYUFVNd",
      "secretKey": "JXIWFiMluQ4gF3goAue/UX92cK/prPZC06SnLJ093VQ="
    }
