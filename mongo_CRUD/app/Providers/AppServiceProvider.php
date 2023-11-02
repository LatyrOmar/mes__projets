<?php

namespace App\Providers;

use Illuminate\Support\ServiceProvider;
use Illuminate\Support\Facades\Validator;
class AppServiceProvider extends ServiceProvider
{
    /**
     * Register any application services.
     *
     * @return void
     */
    public function register()
    {
        //
    }

    /**
     * Bootstrap any application services.
     *
     * @return void
     */
    public function boot()
    {
        //
       
            Validator::extend('BinData', function ($attribute, $value, $parameters, $validator) {
                // Vérifiez ici si $value est un objet BinData valide selon vos critères
                // Si c'est valide, retournez true, sinon retournez false
                // Vous pouvez également personnaliser les messages d'erreur ici
                return true; // ou false selon vos critères de validation
            });


    }
}
