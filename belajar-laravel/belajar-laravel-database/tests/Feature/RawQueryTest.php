<?php

namespace Tests\Feature;

use Illuminate\Foundation\Testing\RefreshDatabase;
use Illuminate\Foundation\Testing\WithFaker;
use Illuminate\Support\Facades\DB;
use Tests\TestCase;

class RawQueryTest extends TestCase
{
    protected function setUp():void
    {
        parent::setUp(); // TODO: Change the autogenerated stub
        DB::delete('delete from categories');
    }

    public function testCrud()
    {

        DB::insert('insert into categories (id, name, description, created_at)values (?,?,?,?)', ['GADGET', 'Gadget', 'Gadget Category', now()]);

        $result = DB::select('select * from categories where id = ?', ['GADGET']);

        $this->assertCount(1, $result);
        $this->assertEquals('GADGET', $result[0]->id);
        $this->assertEquals('Gadget', $result[0]->name);
        $this->assertEquals('Gadget Category', $result[0]->description);
        $this->assertNotNull($result[0]->created_at);
    }

    public function testCrudNamedParameter()
    {

        DB::insert('insert into categories (id, name, description, created_at)values (:id, :name, :description, :created_at)', [
            'id' => 'GADGET',
            'name' => 'Gadget',
            'description' => 'Gadget Category',
            'created_at' => now()
        ]);

        $result = DB::select('select * from categories where id = ?', ['GADGET']);

        $this->assertCount(1, $result);
        $this->assertEquals('GADGET', $result[0]->id);
        $this->assertEquals('Gadget', $result[0]->name);
        $this->assertEquals('Gadget Category', $result[0]->description);
        $this->assertNotNull($result[0]->created_at);
    }
}