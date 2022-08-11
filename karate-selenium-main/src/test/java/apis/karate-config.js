function fn() {
    var env = karate.env; // get system property 'karate.env'
    karate.log('karate.env system property was:', env);
    if (!env) {
        env = 'test';
    }
    var config = {
        env: env,
        myVarName: 'someValue',
        baseUrl: 'https://petstore.swagger.io/v2'
    }
    if (env == 'test') {
        // customize
        // e.g. config.foo = 'bar';
    } else if (env == 'qa') {
        // customize
    }
    karate.log('WEb Service Project')
    return config;
}