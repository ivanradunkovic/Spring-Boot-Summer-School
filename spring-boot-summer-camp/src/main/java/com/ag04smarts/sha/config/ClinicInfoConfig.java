package com.ag04smarts.sha.config;

import com.ag04smarts.sha.domain.Disease;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource({"classpath:application.properties", "classpath:sha.properties"})
public class ClinicInfoConfig {

    @Value("${clinic.name}")
    private String clinicName;

    @Value("${clinic.web.url}")
    private String clinicWebUrl;

    private String clinicUrlLinkedin;
    private String clinicUrlTwitter;

    public ClinicInfoConfig() {
    }

    public String getClinicName() { return clinicName; }
    public void setClinicName(String clinicName) { this.clinicName = clinicName; }

    public String getClinicWebUrl() { return clinicWebUrl; }
    public void setClinicWebUrl(String clinicWebUrl) { this.clinicWebUrl = clinicWebUrl; }

    public String getClinicUrlLinkedin() { return clinicUrlLinkedin; }
    public void setClinicUrlLinkedin(String clinicUrlLinkedin) { this.clinicUrlLinkedin = clinicUrlLinkedin; }

    public String getClinicUrlTwitter() { return clinicUrlTwitter; }
    public void setClinicUrlTwitter(String clinicUrlTwitter) { this.clinicUrlTwitter = clinicUrlTwitter; }

    @Bean
    public Disease disease() {
        return new Disease("disease");
    }

    @Autowired
    ClinicInfoConfig(@Value("${clinic.url.linkedin}") String clinicUrlLinkedin,
                @Value("${clinic.url.twitter}") String clinicUrlTwitter) {
        this.clinicUrlLinkedin = clinicUrlLinkedin;
        this.clinicUrlTwitter = clinicUrlTwitter;
    }

    public ClinicInfoConfig clinicInfoConfig() {
        ClinicInfoConfig clinicInfoConfig = new ClinicInfoConfig();
        clinicInfoConfig.setClinicName(clinicName);
        clinicInfoConfig.setClinicWebUrl(clinicWebUrl);
        return clinicInfoConfig;
    }
}

