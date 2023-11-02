<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\CRUDcontroller;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});
Route::get('/product/index', function () {
    return view('product.index');
});
Route::resource('Product',CRUDcontroller::class);



