#coding=utf-8

import rsa
import sys

def make_key():
    (pubkey, privkey) = rsa.newkeys(1024)
    with open('public.pem', 'w+') as f:
        f.write(pubkey.save_pkcs1().decode())

    with open('private.pem', 'w+') as f:
        f.write(privkey.save_pkcs1().decode())

def encrypt_key(message):
    with open('../docs/public.pem') as publickfile:
        p = publickfile.read()
        pubkey = rsa.PublicKey.load_pkcs1(p)
    crypto = rsa.encrypt(message.encode(), pubkey)
    return crypto

def ecrypt_key(crypto):
    with open('private.pem') as privatefile:
        p = privatefile.read()
        privkey = rsa.PrivateKey.load_pkcs1(p) 
    message = rsa.decrypt(crypto, privkey)
    return message
