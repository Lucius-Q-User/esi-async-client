package luser.esi.client;

public class ApiClient extends ApiClientBase {
    %for tag in tags:
    private ${tag}Api ${first_lower(tag)}Api = new ${tag}ApiImpl(this);
    public ${tag}Api get${tag}Api() {
        return ${first_lower(tag)}Api;
    }
    %endfor
}
