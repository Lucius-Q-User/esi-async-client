package luser.esi.client;

import java.io.IOException;

@FunctionalInterface
interface ResponseParser<T> {
    T apply(String str) throws IOException;
}
