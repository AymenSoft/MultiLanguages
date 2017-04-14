# MultiLanguages
<p>Change android app language programmatically, and save the selected language 
in sharedpreferences to load it in the next launching.</p>
<p>1- import
<a target="_blank" href="https://github.com/AymenSoft/MultiLanguages/blob/master/app/src/main/java/com/aymensoft/multilanguages/AppLanguage.java">
AppLanguage.java</a> to your project.</p>
<p>2-to change language use:</p>
<pre style="background-color:#2b2b2b;color:#a9b7c6;font-family:'Courier New';font-size:12,0pt;"><span style="background-color:#344134;">AppLanguage</span>.<span style="font-style:italic;">setLocale</span>(MainActivity.<span style="color:#cc7832;">this,</span><span style="color:#6a8759;">&quot;ar&quot;</span>)<span style="color:#cc7832;">;
</span>recreate()<span style="color:#cc7832;">;</span></pre>
<p>&quot;ar&quot; is for arab language, &quot;fr&quot; for french language....</p>
<p>&quot;recreate()&quot; to refresh activity with the selected language.</p>
<p>3-save selected language in sharedpreferences to load it in the next 
launching:</p>
<pre style="background-color:#2b2b2b;color:#a9b7c6;font-family:'Courier New';font-size:12,0pt;"><span style="background-color:#344134;">SharedPreferences</span>.Editor editor = <span style="color:#9876aa;">sharedpreferences</span>.edit()<span style="color:#cc7832;">;
</span>editor.putString(<span style="color:#9876aa;font-style:italic;">LanguagePreferences</span><span style="color:#cc7832;">,</span><span style="color:#6a8759;">&quot;ar&quot;</span>)<span style="color:#cc7832;">;
</span>editor.apply()<span style="color:#cc7832;">;</span></pre>
<p>4-to load the selected language in the begining, use this code before &quot;setContentView()&quot;:</p>
<pre style="background-color:#2b2b2b;color:#a9b7c6;font-family:'Courier New';font-size:12,0pt;"><span style="color:#808080;">//1-read and apply language settings
</span><span style="color:#9876aa;">sharedpreferences </span>= getSharedPreferences(<span style="color:#9876aa;font-style:italic;">SettingsPreferences</span><span style="color:#cc7832;">, </span><span style="color:#9876aa;font-style:italic;">MODE_PRIVATE</span>)<span style="color:#cc7832;">;
</span><span style="color:#9876aa;">Language</span>=<span style="color:#9876aa;">sharedpreferences</span>.getString(<span style="color:#9876aa;font-style:italic;">LanguagePreferences</span><span style="color:#cc7832;">,</span><span style="color:#6a8759;">&quot;fr&quot;</span>)<span style="color:#cc7832;">;
</span>AppLanguage.<span style="font-style:italic;">setLocale</span>(MainActivity.<span style="color:#cc7832;">this,</span><span style="color:#9876aa;">Language</span>)<span style="color:#cc7832;">;</span></pre>
<p>&nbsp;</p>
<p>
Enjoy Developping with simple trics from AymenSoft<br>
WebSite: www.aymen-soft.com<br>
Facebook: https://www.facebook.com/AymenSoft<br>
twitter: https://twitter.com/aymen_soft<br>
GooglePlus: https://plus.google.com/+AymenSoftOfficial<br>
Telegram: https://telegram.me/AymenSoftOfficial<br>
</p>
